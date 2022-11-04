package Day_19;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        search_armstrong_number_in_given_range(n);

    }

    public static void search_armstrong_number_in_given_range(int n) {
        if (n < 100) {
            System.out.println(1);
            return;
        }

        for (int i = 2; i <= n; i++) {
            if (search_armstrong_number_helper(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean search_armstrong_number_helper(int n) {
        int ans = 0;
        int copy = n;
        int rem = 0;

        while (copy > 0) {
            rem = copy % 10;
            ans = ans + (rem * rem * rem);
            copy = copy / 10;
        }

        if (ans == n) {
            return true;
        } else {
            return false;
        }
    }
}
