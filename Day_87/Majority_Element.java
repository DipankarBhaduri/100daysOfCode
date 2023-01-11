package Day_87;

import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {

    }
}

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int value = nums[i];

            if (map.containsKey(value)) {
                int temp = map.get(value);
                map.put(value, temp + 1);
            } else {
                map.put(value, 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > (n / 2)) {
                return e.getKey();
            }
        }

        return 0;
    }
}