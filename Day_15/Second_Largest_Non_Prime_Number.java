package Day_15;

import java.util.*;

public class Second_Largest_Non_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = second_largest_non_prime(arr);
        System.out.print(ans);
    }

    public static int second_largest_non_prime(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (prime_non_prime(arr[i])) {
                count++;
            }
            if (count == 2) {
                return arr[i];
            }
        }

        return -1;
    }

    public static boolean prime_non_prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count != 2) {
            return true;
        } else {
            return false;
        }
    }
}
