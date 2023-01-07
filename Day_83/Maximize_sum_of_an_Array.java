package Day_83;

import java.util.*;

public class Maximize_sum_of_an_Array {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 4, 1 };
        Solution solution = new Solution();
        int result = solution.Maximize(arr, 5);
        System.out.print(result);
    }
}

class Solution {
    int Maximize(int arr[], int n) {
        Arrays.sort(arr);
        long ans = 0;
        for (long i = 0; i < n; i++) {
            ans += (arr[(int) i] * i);
            ans = ans % 1000000007;
        }
        return (int) ans % 1000000007;
    }
}