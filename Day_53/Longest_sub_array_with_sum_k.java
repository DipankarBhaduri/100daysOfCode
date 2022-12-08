package Day_53;

import java.util.*;

public class Longest_sub_array_with_sum_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = lenOfLongSubarr(arr, n, k);
            System.out.println(ans);
        }
    }

    static int lenOfLongSubarr(int[] arr, int n, int k) {
        int maxlength = 0;

        for (int i = 0; i < n; i++) {

            // Variable to store sum of subarrays
            int Sum = 0;

            for (int j = i; j < n; j++) {

                // Storing sum of subarrays
                Sum += arr[j];

                // if Sum equals K
                if (Sum == k) {

                    // Update maxLength
                    maxlength = Math.max(maxlength, j - i + 1);
                }
            }
        }

        // Return the maximum length
        return maxlength;
    }
}
