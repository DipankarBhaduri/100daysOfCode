/*

You are given a string S. Your task is to find out whether the given string is 
a double string or not i.e., if it is some string written twice in a row.

For example, the strings "aa", "abcabc", "abab" and "baabaa" are double strings. 
But the strings "aaa", "abaaab" and "abcdabc" are not double string.

 */
package Day_12;

import java.util.*;

public class Double_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        if (check_double(s)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    public static boolean check_double(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt((n / 2) + i)) {
                return false;
            }
        }
        return true;
    }
}
