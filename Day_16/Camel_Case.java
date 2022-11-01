package Day_16;

import java.util.*;

public class Camel_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            camel_case_modification(s);
        }
        sc.close();
    }

    public static void camel_case_modification(String s) {
        String ans = "";
        int n = s.length();

        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '_') {
                count++;
            } else if (count == 1) {
                String curs = "" + ch;
                ans += curs.toUpperCase();
                count = 0;
            } else {
                ans += ch;
            }
        }
        System.out.println(ans);

    }
}
