package Day_88;

import java.util.*;

public class Count_Distinct_Element {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        Solution s = new Solution();
        int result = s.count_element(arr);
        System.out.print(result);
    }
}

class Solution {
    public int count_element(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (map.containsKey(value)) {
                int temp = map.get(value);
                map.put(value, temp + 1);
            } else {
                map.put(value, 1);
            }
        }
        return map.size();
    }
}