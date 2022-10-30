package Day_13;

import java.util.*;

public class Sum_of_Digits_of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        sum_of_digit(n);

    }

    public static void sum_of_digit(int n) {
        for (int i = 1; i <= n; i++) {
            int ans = helper(i);
            System.out.println(ans);
        }
    }

    public static int helper(int n) {
        int rem = 0;
        int ans = 0;

        while (n > 0) {
            rem = n % 10;
            ans += rem;
            n = n / 10;
        }

        return ans;
    }
}
