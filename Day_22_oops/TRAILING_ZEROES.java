package Day_22_oops;

import java.util.*;

public class TRAILING_ZEROES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sc.close();
        int total_trailing_zero = calculate_trailing_zero(num);
        System.out.print(total_trailing_zero);
    }

    static int calculate_trailing_zero(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 0) {
            return 0;
        }
        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= i;
        }

        int result = helper_of_calculate_trailing_zero(ans);
        return result;
    }

    static int helper_of_calculate_trailing_zero(long n) {
        int countZeros = 0;

        while (n > 0) {
            long rem = n % 10;
            if (rem == 0) {
                countZeros++;
            } else {
                return countZeros;
            }
            n = n / 10;
        }
        return -1;
    }
}
