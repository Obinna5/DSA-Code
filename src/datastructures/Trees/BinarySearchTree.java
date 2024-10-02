package datastructures.Trees;

public class BinarySearchTree {

    Node root; // The top parent Node needs a pointer pointing to it, like LL have top

    /* Un-needed?
    public BinarySearchTree (int value) { // Creates node and sets root to it
        Node newNode = new Node(value);
        root = newNode;
    }
 */

    class Node {

       int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }


        /*
    Since we don't know how many steps we will loop, you use a WHILE LOOP
    temp will be the iterator and should be first set to root

     Insert = if nn > i then nn goes i.right
     If nn < i then nn goes i.left >> then nn goes to i.right
     Nested for loops

    *** Psuedo Code for INSERT ***
    create newNode
    if root == null then root = newNode
    temp = root
    while loop
    if newNode == temp return false // Searching for duplciates
    if < left else > right
    if null insert newNode else move to next

    Edge cases = if tree is empty

     */

    public boolean insert(int value) {  // Boolean because we need to verify a node can be added.
        Node newNode = new Node (value);
    if (root == null) {
        root = newNode;
        return true;
    }

    Node temp = root;
    while (true) {
        if (newNode.value == temp.value)  return false; // Comparing the values
            if (newNode.value < temp.value) { // It goes left: So its either check to see if empty or if there are already children
                if (temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else { // Inserting on the right

                if (newNode.value> temp.value) { // For the right side
                    if (temp.right == null){ //
                        temp.right = newNode;
                        return true;
                    }
                    temp = temp.right;
                }
            }
        }
    }

    /*

    *** Psuedo Code CONTAINS ***

   Root equals NULL then return false
   temp = root
   while temp != null
        if < left
        else if > right
        else == return true
   return false

   you can find value by comparing the value to the temp value
   while loop is create for temp is not null ( node value isn't present)


temp creation and assignment to specific value

if root == temp exit
if not start from left
if temp equal to root.nextl exit
if temp equla to root.nextr exit

     */

    // If the value is in the tree return True, if not return false
    public boolean contains (int value) {
        if (root == null) return false; // current node is empty
        Node temp = root;  // temp variable to iterate through tree
        while (temp != null) { // Contains 3 scenarios
            if (value < temp.value) { // value is less than
                temp = temp.left;
            } else if (value > temp.value){ // value is greater than
                temp = temp.right;
            }
            else { // value matches
                return true;
            }



        }
        return false;
    }

}
