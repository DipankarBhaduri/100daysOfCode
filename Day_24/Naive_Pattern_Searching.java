package Day_24;

import java.util.*;

public class Naive_Pattern_Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        sc.close();
        boolean ans = naive_pattern_searching(s1, s2);
        if (ans) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean naive_pattern_searching(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if (n2 > n1) {
            return false;
        }

        String curStr = "";
        for (int i = 0; i < n2; i++) {
            char ch = s1.charAt(i);
            curStr += ch;
        }

        if (curStr.equals(s2)) {
            return true;
        }

        int idx = 0;
        for (int i = n2; i < n1; i++) {
            char ch1 = s1.charAt(i);
            curStr += ch1;
            idx++;
            if (curStr.substring(idx).equals(s2)) {
                return true;
            }
        }
        return false;
    }
}
