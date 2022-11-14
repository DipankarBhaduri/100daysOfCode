package Day_29;

import java.util.*;

public class Priyanshu_and_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        print_palindrome(n);
    }

    public static void print_palindrome(int n) {
        for (int i = 1; i <= n; i++) {
            boolean b = helper_of_printing_palindrome(i);
            if (b) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean helper_of_printing_palindrome(int n) {
        int copy = n;
        int rem = 0;
        int rev = 0;

        while (copy > 0) {
            rem = copy % 10;
            rev = rev * 10 + rem;
            copy = copy / 10;
        }

        if (rev == n) {
            return true;
        } else {
            return false;
        }
    }
}
