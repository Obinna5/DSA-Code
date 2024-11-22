// 11.21.24
package InterviewResources.CodeSignals;

import java.lang.Math;


public class SumofDigits {


public int addNum(int input) {
int result = 0;

while (input != 0) {
// Find remainder
    System.out.println("Before Remainder: "+input);
    int remainder = Math.abs(input) % 10;
    System.out.println("After Remainder: "+remainder+ "\n");

    result += remainder;        // Add remainder to final reult
    input = input / 10;         // Dividing will give the absolute value of input numnber
}
   return result;
}
}



/*


package InterviewResources.CodeSignals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumofDigitsTest {

    @Test
    public void testAddNum_SingleDigit() {
        SumofDigits sumofDigits = new SumofDigits();
        int result = sumofDigits.addNum(5);
        assertEquals(5, result);
    }

    @Test
    public void testAddNum_MultiDigit() {
        SumofDigits sumofDigits = new SumofDigits();
        int result = sumofDigits.addNum(123);
        assertEquals(6, result);
    }

    @Test
    public void testAddNum_Zero() {
        SumofDigits sumofDigits = new SumofDigits();
        int result = sumofDigits.addNum(0);
        assertEquals(0, result);
    }

    @Test
    public void testAddNum_Negative() {
        SumofDigits sumofDigits = new SumofDigits();
        int result = sumofDigits.addNum(-123);
        assertEquals(6, result);
    }
}


* */