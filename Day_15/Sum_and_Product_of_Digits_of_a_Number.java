package Day_15;

import java.util.*;

public class Sum_and_Product_of_Digits_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int product = product_of_digit(n);
        int sum = sum_of_digit(n);
        int final_ans = product + sum;

        System.out.print(final_ans);

    }

    public static int sum_of_digit(int n) {
        int ans = 0;
        int copy = n;

        while (copy > 0) {
            int rem = copy % 10;
            ans += rem;
            copy = copy / 10;
        }

        return ans;

    }

    public static int product_of_digit(int n) {
        int ans = 1;
        int copy = n;

        while (copy > 0) {
            int rem = copy % 10;
            ans *= rem;
            copy = copy / 10;
        }

        return ans;
    }
}
