/**package InterviewResources.Modular;

// Originally named as ArithmeticOperation.java
public interface ModularCalculator {
    void perform(int a, int b);
}

// Addition.java
public class Addition implements ModularCalculator {
    @Override
    public void perform(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
}

// Subtraction.java
public class Subtraction implements ModularCalculator {
    @Override
    public void perform(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

// Multiplication.java
public class Multiplication implements ModularCalculator {
    @Override
    public void perform(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
}

// Division.java
public class Division implements ModularCalculator {
    @Override
    public void perform(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}

// Calculator.java
public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.performOperation(new Addition(), 2, 3);
        calculator.performOperation(new Subtraction(), 5, 2);
        calculator.performOperation(new Multiplication(), 4, 5);
        calculator.performOperation(new Division(), 10, 2);
    }

    public void performOperation(ModularCalculator operation, int a, int b) {
        operation.perform(a, b);
    }
}

 **/