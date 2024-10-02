package datastructures.Cookie;

public class Main {

    public static void main(String[] args) {
	// write your code here
     //   System.out.println("\n Hello Obinna!");

    Cookie c = new Cookie("Chocolate Chip");
    Cookie c2 = new Cookie("Sugar");
    c2.setFlavor("Michael Damien");

    // Return statements need to be printed out
        System.out.println(c.getFlavor());

        System.out.println(c2.getFlavor());
    }
}
