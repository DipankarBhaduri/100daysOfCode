package Day_60;

import java.util.*;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = minimum_size_subarray_sum(arr, k);
        System.out.print(ans);
    }

    static int minimum_size_subarray_sum(int[] arr, int k) {
        int n = arr.length;
        if (n == 1 && arr[0] >= k) {
            return 1;
        }
        if (n == 1 && arr[0] < k) {
            return 0;
        }
        int sum = 0;
        int start = 0;
        int smallest_sum = Integer.MAX_VALUE;
        int prefix = 0;

        for (int i = 0; i < n; i++) {
            prefix += arr[i];
            int value = arr[i];
            if (sum <= k) {
                sum += value;
            }
            if (sum >= k) {
                smallest_sum = Math.min(i - start + 1, smallest_sum);
            }
            if (sum > k) {
                while (sum > k) {
                    sum -= arr[start++];
                }
                if (sum >= k) {
                    smallest_sum = Math.min(i - start + 1, smallest_sum);
                }
            }
        }

        if (prefix < k) {
            return 0;
        } else {
            return smallest_sum;
        }
    }
}
