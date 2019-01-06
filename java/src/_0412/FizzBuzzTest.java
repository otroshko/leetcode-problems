package _0412;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    private FizzBuzz _solution = new FizzBuzz();

    @Test
    public void test1() {
        // Arrange
        int n = 15;
        List<String> expectedResult = List.of(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz");

        // Act
        List<String> actualResult = _solution.fizzBuzz(n);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}