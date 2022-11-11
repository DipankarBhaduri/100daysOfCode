package Day_26;

import java.util.*;

public class two_sum_Leetcode {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            int value = nums[i];
            if (map.containsKey(target - value)) {
                result[0] = i;
                result[1] = map.get(target - value);
            } else {
                map.put(value, i);
            }
        }

        return result;

    }
}