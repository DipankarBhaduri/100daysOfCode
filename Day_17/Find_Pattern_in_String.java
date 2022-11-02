package Day_17;

import java.util.*;

public class Find_Pattern_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        if (find_the_substring(s1, s2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    public static boolean find_the_substring(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if (n2 < n1) {
            return false;
        }

        String wString = "";
        for (int i = 0; i < n1; i++) {
            char ch = s2.charAt(i);
            wString += ch;
        }

        if (s1.equals(wString)) {
            return true;
        }

        String curr = "";
        int idx = 1;
        for (int i = n1; i < n2; i++) {
            char ch = s2.charAt(i);
            wString += ch;
            curr = wString.substring(idx++);
            if (curr.equals(s1)) {
                return true;
            }
        }

        return false;
    }
}
