package datastructures.HashTables;

public class Main {

    public static void main(String [] args) {

        HashTable ht = new HashTable();

        ht.printTable();



    }
}


/*
* Hash tables have key value pairs that is linked to an address/index on an array. {"nails" = 20}
* Hash methods are determinsitic - everytime you run nails you WILL get the address of 2
* Imagine the array as an vertical index of numbers.
* Collisions happen when you store an item in an index that currently has a value.
* Example: set("nuts", 20) get("nails")
*
* DEALING WITH COLLISIONS: Through Separate Chaining, put the next KVP at the next address. 2: KVP-KVP2-KVP3
* Linear Probing: Simply adding a KVP to the next address. Ex. if 2 is used then move to address 3
* Separate chaining: Storing KVP at one address through Linked Lists.
*
*
*
*
* */