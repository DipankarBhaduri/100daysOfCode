package Day_16;

import java.util.*;

public class Subarray_Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int windowsize = sc.nextInt();
        int sum = sc.nextInt();
        sc.close();

        boolean ans = find_subarray_with_given_sum(arr, windowsize, sum);
        if (ans == true) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }

    public static boolean find_subarray_with_given_sum(int[] arr, int windowsize, int sum) {
        int wsum = 0;

        for (int i = 0; i < windowsize; i++) {
            wsum += arr[i];
        }
        if (wsum == sum) {
            return true;
        }
        if (wsum > sum) {
            return false;
        }
        if (wsum < sum) {
            for (int i = windowsize; i < arr.length; i++) {
                wsum += arr[i];
                wsum -= arr[i - windowsize];
                if (wsum == sum) {
                    return true;
                }
            }
        }

        return false;
    }
}
