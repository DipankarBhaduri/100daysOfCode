package Day_11;

import java.util.*;

public class JS_String_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int ans = count_word(s);
        System.out.print(ans);

    }

    public static int count_word(String s) {
        if (s.length() == 1 || s.length() == 2) {
            return 1;
        }

        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                count++;
            }

        }

        return count + 1;
    }
}
