package Day_20;

import java.util.*;

public class Longest_Sub_Array_with_Sum_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            sc.close();
            int maximum_subarray = longest_subarray_with_given_sum(arr, sum);
            System.out.println(maximum_subarray);
        }
    }

    public static int longest_subarray_with_given_sum(int[] arr, int sum) {
        int maxSubArray = 0;
        int start = 0;
        int end = 0;
        int wsum = 0;

        // for (int i = 0; i < arr.length; i++) { // -5 8 -14 2 4 12

        while (start < arr.length) {
            wsum += arr[start];
            if (wsum == sum) {
                maxSubArray = Math.max(maxSubArray, (start - end) + 1);
                wsum = wsum - (arr[end++]);
                start++;
            } else if (wsum < sum) {
                start++;
            } else {
                start++;
            }
        }
        return maxSubArray;
    }
}
