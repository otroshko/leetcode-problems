package _0026;

/*
    Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
*/


public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length < 1) return 0;

        int currentPosition = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[currentPosition++] = nums[i];
            }
        }

        return currentPosition;
    }

    public int removeDuplicatesOld(int[] nums) {
        if(nums == null) return 0;

        if(nums.length < 2) return nums.length;

        int current = 1;
        int next = current;

        while (current < nums.length && next < nums.length) {
            if(nums[current] > nums[current-1]) {
                current++;
                next = current;
            } else {
                if(nums[next] > nums[current-1]) {
                    nums[current] = nums[next];
                } else {
                    next++;
                }
            }
        }

        return current;
    }
}
