package Day_88;

import java.util.*;

public class Largest_Subarray_with_sum_zero {
    public static void main(String[] args) {
        int[] arr = { 15, -1, -5, -9, 12, 15, 18, 16 };
        solution4 s4 = new solution4();
        int ans = s4.largest_subarray_sum_zero(arr);
        System.out.print("The largest subarray with zero sum is : " + ans);
    }
}

class solution4 {
    public int largest_subarray_sum_zero(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0, sum = 0;
        map.put(sum, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                int value = map.get(sum);
                max = Math.max(max, i - value);
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }
}