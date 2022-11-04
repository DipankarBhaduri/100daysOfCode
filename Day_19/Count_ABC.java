package Day_19;

import java.util.*;

public class Count_ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int count = count_abc_OR_aba(s);
        System.out.print(count);
    }

    public static int count_abc_OR_aba(String s) {
        int n = s.length();
        int count = 0;

        if (n < 3) {
            return 0;
        } else {
            String cur = "";
            for (int i = 0; i < 3; i++) {
                char ch = s.charAt(i);
                cur += ch;
            }

            if ((cur.equals("abc")) || (cur.equals("aba"))) {
                count++;
            }

            int idx = 1;
            for (int i = 3; i < n; i++) {
                char ch = s.charAt(i);
                cur += ch;

                if ((cur.substring(idx).equals("abc")) || (cur.substring(idx).equals("aba"))) {
                    count++;
                }
                idx++;
            }
        }

        return count;
    }
}
