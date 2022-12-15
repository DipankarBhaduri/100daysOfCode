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
        int smallest_sum = 0;

        for (int i = 0; i < n; i++) {
            int value = arr[i];
            if (sum < k) {
                sum += value;
            } else if (sum >= k) {
                smallest_sum = Math.min(i - start, smallest_sum);
            } else if (sum > k) {
                while (sum > k) {
                    sum -= arr[start++];
                }
            }
        }

        return smallest_sum;
    }
}
