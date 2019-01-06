package _0026;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray _solution = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test1() {
        // Arrange
        int[] nums = new int[] { 1,1,2 };
        int expectedLength = 2;

        // Act
        int actualLength = _solution.removeDuplicates(nums);

        // Assert
        assertEquals(expectedLength, actualLength);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
    }

    @Test
    public void test2() {
        // Arrange
        int[] nums = new int[] { 0,0,1,1,1,2,2,3,3,4 };
        int expectedLength = 5;

        // Act
        int actualLength = _solution.removeDuplicates(nums);

        // Assert
        assertEquals(expectedLength, actualLength);
        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(2, nums[2]);
        assertEquals(3, nums[3]);
        assertEquals(4, nums[4]);
    }

    @Test
    public void test3() {
        // Arrange
        int[] nums = new int[] { 1, 2, 3 };
        int expectedLength = 3;

        // Act
        int actualLength = _solution.removeDuplicates(nums);

        // Assert
        assertEquals(expectedLength, actualLength);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(3, nums[2]);
    }
}