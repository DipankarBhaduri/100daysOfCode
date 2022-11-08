package Day_23;

import java.util.*;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        if (check_palindrome(s)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    public static boolean check_palindrome(String s) {
        StringBuilder sb = new StringBuilder(s);

        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            int front = i;
            int back = n - 1 - i;
            char frontChar = s.charAt(front);
            char backChar = s.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        String ans = sb.toString();
        if (s.equals(ans)) {
            return true;
        } else {
            return false;
        }
    }
}
