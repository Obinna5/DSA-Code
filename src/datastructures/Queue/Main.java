package datastructures.Queue;

public class Main {

    public static void main(String [] args) {

        Queue myQueue = new Queue(5);

        myQueue.enqueue(10);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println(myQueue.dequeue().value);

        myQueue.printQueue();

    }
}
