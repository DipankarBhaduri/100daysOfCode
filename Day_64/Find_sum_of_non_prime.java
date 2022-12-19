package Day_64;

import java.util.*;

public class Find_sum_of_non_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = sum_of_non_prime_in_array(arr);
        System.out.print(ans);
    }

    static int sum_of_non_prime_in_array(int[] arr) {
        int n = arr.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            boolean b = check_prime_or_not(val);
            if (b) {
                sum += val;
            }
        }

        return sum;
    }

    static boolean check_prime_or_not(int n) {
        if (n == 1) {
            return true;
        }

        if (n == 2) {
            return true;
        }

        if (n == 3) {
            return false;
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count > 2) {
            return true;
        } else {
            return false;
        }
    }
}
