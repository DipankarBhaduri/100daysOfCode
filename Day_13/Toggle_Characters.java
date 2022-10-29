package Day_13;

import java.util.*;

public class Toggle_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String result = perfrom_the_troggling(s);
        System.out.print(result);
    }

    public static String perfrom_the_troggling(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            String ss = "";
            if (ch >= 'a' && ch <= 'z') {
                ss += ch;
                sb.append(ss.toUpperCase());
            } else if (ch >= 'A' && ch <= 'Z') {
                ss += ch;
                sb.append(ss.toLowerCase());
            } else {
                ss += ch;
                sb.append(ss);
            }
        }

        return sb.toString();
    }
}
