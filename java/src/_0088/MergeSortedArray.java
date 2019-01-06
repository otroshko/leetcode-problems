package _0088;

/*
    Problem #88

    Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

    Note:

    The number of elements initialized in nums1 and nums2 are m and n respectively.
    You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
*/

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n < 1) {
            return;
        }

        int idx1 = m - 1, idx2 = n - 1, currentPosition = m + n - 1;

        while(idx1 >=0 && idx2 >= 0) {
            nums1[currentPosition--] = nums1[idx1] > nums2[idx2]
                    ? nums1[idx1--]
                    : nums2[idx2--];
        }

        while(idx2 >= 0) {
            nums1[currentPosition--] = nums2[idx2--];
        }
    }
}
