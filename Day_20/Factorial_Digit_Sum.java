package Day_20;

import java.util.*;

public class Factorial_Digit_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        calculate_factorial_digit_sum(n);
    }

    public static void calculate_factorial_digit_sum(int n) {
        for (int i = 1; true; i++) {
            int ans = helper(i);
            if (ans == n) {
                System.out.print(i);
                break;
            }
        }
    }

    public static int helper(int n) {
        int result = 0;

        while (n > 0) {
            int rem = n % 10;
            result += helper2(rem);
            n = n / 10;
        }

        return result;
    }

    public static int helper2(int n) {
        int ans = 1;
        if (n == 1) {
            return 1;
        }

        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        return ans;
    }
}
