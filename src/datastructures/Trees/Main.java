package datastructures.Trees;

import datastructures.Queue.Queue;

public class Main {


    public static void main(String [] args) {

      BinarySearchTree bst = new BinarySearchTree();


      bst.insert(25);
      bst.insert(40);
      bst.insert(100);
      bst.insert(15);


        System.out.println("\nRoot = " +bst.root.value+ "\n");
        System.out.println("Dot notation left (lesser) value: " +bst.root.left.value);

        System.out.println("\nContains 25 ? = " +bst.contains(25));
        System.out.println("\nContains 5 ? = " +bst.contains(5));

    }
}

/*

BST are the same as linked lists but with Left and Right forks.

They are only a node, with a left value, and right value.

Nodes that don't have children are leafs

Nodes childs to the left are always less than, while nodes to the right are greater than

Full Trees - every node points to 2 nodes or 0 nodes. A node with one child is not a full tree.
Perfect Trees - symmetrical on all sides

Math = 2^x + 1

It would take one step for a single parent note, 2 steps for a set of children

O(log n) - Very efficient - Divide and conquer

Adding items to Binary tree is O(n)

!! BST are better with lookup/searching and removing; While LL are better with Inserting !!

Lookup - Parent, child row, second row. O(n)
Remove - Iterate, find, remove. O(n)
Add/Insert - Iterate, find, or just add to end O(1)

Search for a specific number automatically cancels out half of the nodes dependent in

Perfect trees gives the best possible time complexity

Worst case happens if each child node is greater than the parent, the tree never forks and the Tree is
technically a LinkedList.


 */