package datastructures.Stacks;
/*
 - Use an ArrayList because its Dynamic
 - Removing and adding is O(1)
 - Perform everything at the top (beginning)

Queue
 - Think of the previous club analogy - FIFO would represent a person going in.
 - Enqueue deals with adding to the end of a queue
 - Dequeue deals with removing the first person from the queue
 - For an array list: The last item of the index is O(1) for adding and O(n) for removing
 - For the array list: The first item of the index is O(1) for both adding and removing.
 - Use First and Last for the beginning and last indexes.

 */

public class stack {

    private Node top;
    private int height; // Similar to LENGTH in LinkedList
//    private Node bottom; // Not needed since we dont remove from the bottom

    public stack(int value) {
        Node newNode = new Node(value); // Creates a node, this is technically the stack so far
        top =  newNode;
        height = 1;
    }

    public void push(int value) {        // Similar to prepending in LL

        // Terminal > Create a new node > set it equal to the value given > have top equal nn > Increase the height

        Node newNode = new Node (value); // Create a new node and pass the value
        if (height == 0){               // If the stack is empty
            top = newNode;
        }
        else {
            newNode.next = top; // Makes the new node POINTER to equal TOP (the current node)
            top = newNode;
        }
        System.out.println("\n PUSH COMMAND >> New pushed value is: " +newNode.value);
        height ++;
    }

    public void printStack(){ // Use temp variables, also using While loops removes the need to use a For loop! When dealing with objects
        Node temp = top;
        System.out.println();
        System.out.println("======================");
        while (temp != null) {  // While its not empty
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("======================");

    }

    public Node pop(){         // Returning type Node since we're trying to pop out the node.
        if (top == null)
        {
            System.out.println("Stacks is empty."); // Or return null
        }

            Node temp = top;
            Node popValue = top;
            top = top.next; // Moves top to the next value
            temp.next = null;

            height --;
        System.out.println("\nPOP COMMAND >> The popped value is: "+popValue.value);
            return temp;


    }
  //  public void getTop(){}

  //  pulbic void getHeight(){}
}
