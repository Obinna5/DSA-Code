package datastructures.HashTables;

public class HashTable {

    private int size = 7;  // size of array
    private Node[] dataMap; // array of pointers to Nodes;



    /*
     * For creating Nodes, we use Key Value and Next
     * An example is Node -> string "man", int age, node next
     * */

public class Node {

    private String key;
    private int value;
    private Node next;

    public Node(String key, int value){
        this.key = key;
        this.value = value;
    }


}

    // An array that creates pointers to nodes
    public HashTable() { // constructor
        dataMap = new Node[size];
    }


    public void printTable(){ // void since no value is beng returned
    for (int i = 0; i < dataMap.length; i++) // we are iterating through the array with variable i
        {
            System.out.println(i+ ":");  // this is used to displayed the address count on each value. 1,2,3...
            Node temp = dataMap[i];      // temp variable created to iterate on the address space
            while (temp != null) {       // while the address space isn't empty..
                System.out.println("{" +temp.key+ "= " +temp.value+ "}"); // print the key/value
                temp = temp.next; // assigning temp to the next pointer for the loop to continue
            }
        }

    }


    // will only be used for methods in Hash table class
     private int hash (String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray(); // puts key in to array of characters: ex. dog into ['d','o','g']
        for (int i=0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i]; // on ASCII table, the letter value is correlated to a number. ex. a = 112
            hash = (hash + asciiValue*23)% dataMap.length; // Returns a number that is 0-6 (which is the array length) uses modyou-lo
        
        }
        return hash;
     }
}

