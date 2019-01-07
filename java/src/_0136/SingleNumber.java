package _0136;

import java.util.HashMap;

/*
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.

    Note:
    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int item: nums) {
            result ^= item;
        }
        return result;
    }

    public int singleNumberOld(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer item:nums) {
            if (map.containsKey(item)) {
                map.remove(item);
            } else {
                map.put(item, item);
            }
        }

        return (Integer) map.values().toArray()[0];
    }
}
