package _0088;

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

    @Test
    public void test2() {
        // Arrange
        int[] expected = new int[] { 1 };
        int[] nums1 = new int[] { 1 };
        int m = 1;
        int[] nums2  = new int[0];
        int n = 0;

        // Act
        _solution.merge(nums1, m, nums2, n);

        // Assert
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void test3() {
        // Arrange
        int[] expected = new int[] { 1,2,3,4,5,6 };
        int[] nums1 = new int[] { 1,2,4,5,6,0 };
        int m = 5;
        int[] nums2  = new int[] { 3 };
        int n = 1;

        // Act
        _solution.merge(nums1, m, nums2, n);

        // Assert
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void test4() {
        // Arrange
        int[] expected = new int[] { 1,2,3,4,5,6 };
        int[] nums1 = new int[] { 4,5,6,0,0,0 };
        int m = 3;
        int[] nums2  = new int[] { 1,2,3 };
        int n = 3;

        // Act
        _solution.merge(nums1, m, nums2, n);

        // Assert
        assertArrayEquals(expected, nums1);
    }
}
