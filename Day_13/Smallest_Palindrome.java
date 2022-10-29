package Day_13;

import java.util.*;

public class Smallest_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int n = sc.nextInt();
            int ans = closest_palindrome(n);
            System.out.println(ans);
        }
        sc.close();
    }

    public static int closest_palindrome(int n) {

        for (int i = n; i >= 0; i--) {
            int cur = i;
            boolean b = helper_of_closest_palindrome(cur);
            if (b == true) {
                return i;
            }
        }

        return -1;
    }

    public static boolean helper_of_closest_palindrome(int n) {
        int copy = n;
        int rev = 0;
        int rem = 0;

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (rev == copy) {
            return true;
        }

        return false;
    }
}
