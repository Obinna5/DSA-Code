package datastructures.Stacks;

public class Main {

    public static void main (String [] args) {

        stack myStack = new stack(75);  // Creates a node with the value of 5

//        myStack.getTop();
//        myStack.getHeight();

        myStack.push(50);
        myStack.push(25);
        myStack.push(15);
        myStack.pop();
        myStack.printStack();


    }


}
