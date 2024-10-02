package DesignPrinciples.Inheritance;

public class Main {

    public static void main(String [] args) {

      Gibson g = new Gibson();
      Fender f = new Fender();

      g.setModel("Les Paul");

        System.out.println("Fender class EXTENDS the Gibson class with the getColor() function --> " +f.getColor());

    }

}
