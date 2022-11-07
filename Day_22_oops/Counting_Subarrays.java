package Day_22_oops;

import java.util.*;

public class Counting_Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        sc.close();
        int subArrayCount = calculate_the_subarray(arr, target);
        System.out.print(subArrayCount);
    }

    public static int calculate_the_subarray(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < target) {
                    count++;
                }
            }
        }

        return count;
    }
}
