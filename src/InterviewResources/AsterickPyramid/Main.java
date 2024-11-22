package InterviewResources.AsterickPyramid;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void asteriskPyramid(int height) {
        for (int i = 0; i < height; i++) {
            // print spaces before asterisks
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // print asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        asteriskPyramid(3);

    }
}
