package InterviewResources.CodeSignals.Test;

import InterviewResources.CodeSignals.SumofDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumofDigitsTest {

    @Test
    void testAddNum_SingleDigit() {

        SumofDigits sod = new SumofDigits();
        int result = sod.addNum(5);
        assertEquals(5, result);
    }

    @Test
    void testAddNum_MultipleDigits() {

        SumofDigits sod = new SumofDigits();
        int result = sod.addNum(25);
        assertEquals(7, result);
    }

    @Test
    public void testAddNum_Negative() {
        SumofDigits sumofDigits = new SumofDigits();
        int result = sumofDigits.addNum(-123);
        assertEquals(6, result);
    }
}