package Arrays;

import java.util.HashMap;

/*
 * Given an unsorted array Arr of size N of positive integers.
 * One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice
 * in array.
 * Find these two numbers.
 * 
 * Example 1:
 * Input:
 * N = 2
 * Arr[] = {2, 2}
 * Output: 2 1
 * Explanation: Repeating number is 2 and
 * smallest positive missing number is 1.
 * 
 * Example 2:
 * Input:
 * N = 3
 * Arr[] = {1, 3, 3}
 * Output: 3 2
 * Explanation: Repeating number is 3 and
 * smallest positive missing number is 2.
 * 
 */

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {
            int val = arr[i];
            if (map.containsKey(val)) {
                ans[0] = val;
            }

            map.put(val, 1);
        }

        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}