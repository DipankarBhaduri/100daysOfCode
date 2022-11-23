/*

Write a program to print all the palindrome number in the range of a to b.

 */
package Day_11;

import java.util.*;

public class AS_Loops_Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        palindrome_in_range(a, b);
    }

    public static void palindrome_in_range(int a, int b) {
        for (int i = a; i <= b; i++) {
            boolean ans = palindrome_checker(i);
            if (ans == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean palindrome_checker(int n) {
        int copy = n;
        int rev = 0;
        int rem = 0;

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (copy == rev) {
            return true;
        } else {
            return false;
        }
    }
}
