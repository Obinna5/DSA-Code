package datastructures.Queue;
//import datastructures.Stacks.Node;


public class Queue {

private Node first;
private Node last;
private int length;


    public Queue (int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

//    Queue myQueue = new Queue(7);


public void printQueue(){
Node temp = first;
    while (temp != null)
    {
        System.out.println(temp.value);
        temp = temp.next;
    }
}

public void getFirst(){
    System.out.println("The first value is: " +first.value);
}

public void getLast(){
    System.out.println("The last value is: " +last.value);
}

public void getLength(){
    System.out.println("The length of the Queue is: " +length);
}

public void enqueue(int value){     // Returning a value since something is being added
     Node newNode = new Node(value); // Create a node
        if (first == null){     // If empty, make the node have the first and the last position
         first = newNode;
         last = newNode;
    }   else {
            last.next = newNode; // Move last pointer to the new node
            last = newNode; // make the new node have the last position
        }
    length ++;
}

public Node dequeue(){          // Purpose is to take first item of the list, remove and return it. Therefore the return type is node.
    if (length == 0){
        return null;
    }
    Node temp = first;  // Make temp the first node to be shifted over
    if (length == 1){
        first = null;
        last = null;
    }
        else {
      first = first.next;   // First moves over to the next node
      temp.next = null; // Since temp is first, make the pointed null to remove it.
    }
    length --; // Decrement the length
        return temp;
}

}

