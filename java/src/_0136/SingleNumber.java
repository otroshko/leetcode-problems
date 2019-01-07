package _0136;

import java.util.HashMap;
import java.util.LinkedList;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int item: nums) {
            result ^= item;
        }
        return result;
    }

    public int singleNumberOld(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();

        for (Integer item:nums) {
            if(list.contains(item)) {
                list.remove(item);
            } else {
                list.add(item);
            }
        }

        return list.getFirst();
    }
}
