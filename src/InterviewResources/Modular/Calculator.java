package InterviewResources.Modular;

/* In-efficient approach due having functions with repetitive tasks.
 * This is design it tightly coupled, not extendable, and not easily modifiable
 *
* */

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2, 3);
        calculator.subtract(5, 2);
        calculator.multiply(4, 5);
        calculator.divide(10, 2);
    }

    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}