package Day_61;

import java.util.*;

public class Maximum_Contiguous_Subarray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = max_contigous_subarray(arr);
        System.out.print(ans);
    }

    static int max_contigous_subarray(int[] arr) {
        int n = arr.length;
        int maxSum = 0;

        int curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum += arr[i];

            if (curSum < 0) {
                curSum = 0;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}

/*
 * 6
 * 2 -1 0 1 2 1
 */