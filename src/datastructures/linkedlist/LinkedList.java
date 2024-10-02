package datastructures.linkedlist;

// Can be seen as a list of nested hash-maps

public class LinkedList {

    // Create variables for Head, Tail, Next, and Node

    Node head;
    Node tail;
    int length;


    // Create inner class of Node: consists of value and pointer

    class Node {

        int value;
        Node next;

        public Node (int value){
            this.value = value;
        }
    }

    // Creating a list
    public LinkedList (int value){

        Node newNode = new Node(value);

        head = newNode;
        tail = newNode;

        length = 1;
    }

    public void printList() {
        Node temp = head; // Create temp value of type Node
        while (temp != null){         // As long as temp/head is not empty print out its value, then set temp to the next value
        System.out.println(temp.value);
        temp = temp.next;
        }
    }

    public void printInReverse() {
        Node temp = tail;
        while (tail != null){
            System.out.println(temp.value);
            temp = temp.next; // Change this!
        }
    }


    public void append(int value){          // Add new node , move tail to point to it , have a pointer for the node , if empty than head / temp point to it.

        Node newNode = new Node(value);     // Create a node
        if (length == 0) {                  // Test terminal condition first
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        length ++;

    }

    public void removeLast(){               // Multiple items > Empty List > One item in a linkend list


    }

    public void preppend(int value){        // Adding a new node to the beginning of the list

        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }


    }


}
