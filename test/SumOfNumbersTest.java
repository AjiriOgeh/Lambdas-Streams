import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfNumbersTest {

    @Test
    public void sumOfPositiveNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 12;
        int expectedOutput = 22;
        int actualOutput = SumOfNumbers.sumOfNumbers(firstNumber, secondNumber);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void sumOfNegativeNumbersTest() {
        int firstNumber = -1;
        int secondNumber = -4;
        int expectedOutput = -5;
        int actualOutput = SumOfNumbers.sumOfNumbers(firstNumber, secondNumber);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void sumOfPositiveNumbers_And_NegativeNumbersTest(){
        int firstNumber = 7;
        int secondNumber = -4;
        int expectedOutput = 3;
        int actualOutput = SumOfNumbers.sumOfNumbers(firstNumber, secondNumber);
        assertEquals(expectedOutput, actualOutput);
    }
}