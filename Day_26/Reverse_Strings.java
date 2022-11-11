package Day_26;

import java.util.*;

public class Reverse_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = reverse_the_string(s);
        System.out.print(ans);
    }

    public static String reverse_the_string(String s) {
        int n = s.length();
        if (n == 1) {
            return s;
        }

        String str = "";
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            str += ch;
        }

        return str;
    }
}