package Day_62_recursion;

/*

Given a string and a non-empty substring sub, compute recursively the largest 
substring which starts and ends with sub and return its length.


strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9

 */

import java.util.*;

public class strDist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        sc.close();
        int ans = strDist(s1, s2);
        System.out.print(ans);
    }

    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        if (str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length()).equals(sub)) {
            return str.length();
        } else if (!str.substring(0, sub.length()).equals(sub)) {
            return strDist(str.substring(1), sub);
        } else {
            return strDist(str.substring(0, str.length() - 1), sub);
        }
    }
}
