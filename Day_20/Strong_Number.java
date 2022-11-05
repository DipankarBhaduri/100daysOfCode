package Day_20;

import java.util.*;

public class Strong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        System.out.print(check_strong_number(n));

    }

    public static int check_strong_number(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int copy = n;
        int result = 0;

        while (copy > 0) {
            int rem = copy % 10;
            result += helper_of_checking_strong_number(rem);
            copy = copy / 10;
        }

        if (result == n) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int helper_of_checking_strong_number(int n) {
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= i;
        }

        return ans;
    }
}
