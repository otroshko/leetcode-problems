package _0136;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {
    private SingleNumber _solution = new SingleNumber();

    @Test
    public void test1() {
        // Arrange
        int[] arr = new int[] { 2,2,1 };
        int expectedResult = 1;

        // Act
        int actualResult = _solution.singleNumber(arr);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test2() {
        // Arrange
        int[] arr = new int[] { 4,1,2,1,2 };
        int expectedResult = 4;

        // Act
        int actualResult = _solution.singleNumber(arr);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}