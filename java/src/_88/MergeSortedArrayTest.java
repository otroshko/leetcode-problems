package _88;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArrayTest {
    private MergeSortedArray _solution = new MergeSortedArray();

    @Test
    public void test1() {
        // Arrange
        int[] expected = new int[] { 1,2,2,3,5,6 };
        int[] nums1 = new int[] { 1,2,3,0,0,0 };
        int m = 3;
        int[] nums2  = new int[] { 2,5,6 };
        int n = 3;

        // Act
        _solution.merge(nums1, m, nums2, n);

        // Assert
        assertArrayEquals(expected, nums1);
    }
}
