package Day_62_recursion;

import java.util.*;
/*

Given a string and a non-empty substring sub, compute recursively if at least 
n copies of sub appear in the string somewhere, possibly with overlapping.
N will be non-negative.


strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true

 */

public class strCopies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n = sc.nextInt();

        sc.close();
        boolean ans = strCopies(s1, s2, n);
        System.out.print(ans);
    }

    public static boolean strCopies(String str, String sub, int n) {

        if (n == 0) {
            return true;
        }
        if (sub.length() > str.length()) {
            return false;
        }

        if (str.substring(0, sub.length()).equals(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        } else {
            return strCopies(str.substring(1), sub, n);
        }
    }
}
