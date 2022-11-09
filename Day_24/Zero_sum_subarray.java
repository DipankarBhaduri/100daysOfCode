package Day_24;

import java.util.*;

public class Zero_sum_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        print_all_zero_subarrays(arr);
    }

    static void print_all_zero_subarrays(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.print(-1);
        }
    }
}
