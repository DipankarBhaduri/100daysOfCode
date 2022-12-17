package Day_62_recursion;

import java.util.*;

public class Maximum_Sum_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = find_the_maximum_sum_subarray(arr);
        System.out.print(ans);
    }

    static int find_the_maximum_sum_subarray(int[] arr) {
        int n = arr.length;
        int currSum = 0;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {

            currSum += arr[i];

            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
