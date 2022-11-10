package Day_25;

import java.util.*;

public class contains_single_digit_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = contains_single_digit(arr);
        System.out.print(ans);
    }

    public static int contains_single_digit(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        while (sum > 9) {
            sum = helper_of_contains_single_digit(sum);
        }

        return sum;
    }

    public static int helper_of_contains_single_digit(int n) {
        int digit_sum = 0;

        while (n > 0) {
            int rem = n % 10;
            digit_sum += rem;
            n = n / 10;
        }

        return digit_sum;
    }
}
