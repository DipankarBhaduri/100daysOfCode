package Day_24;

import java.util.*;

public class Sum_of_odd_length_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            sc.close();
            int sum = sum_of_odd_length_subarray(arr);
            System.out.println(sum);
        }
    }

    public static int sum_of_odd_length_subarray(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            int cursum = 0;
            for (int j = i; j < n; j++) {
                int value = arr[j];
                count++;
                cursum += value;
                if (count % 2 != 0) {
                    sum += cursum;
                }
            }
        }
        return sum;
    }
}
