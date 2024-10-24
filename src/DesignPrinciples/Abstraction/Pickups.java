package DesignPrinciples.Abstraction;

/*
*  Abstract Classes allows you to create a base class that can be extended to create other classes.
*  Abstract methods can be Overridden in the extended classes.
*  Abstract methods cannot be used to create objects.
*
* */

public abstract class Pickups {


    public abstract void pickup();

    public void stringType() {
        System.out.println("These are Ernie Ball strings");
    }


}