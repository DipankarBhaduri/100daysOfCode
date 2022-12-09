package Day_54;

import java.util.*;

public class Camel_Case_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        print_camel_case_word(s);
    }

    static void print_camel_case_word(String s) {
        int n = s.length();
        String cur = "";
        cur += s.charAt(0);

        for (int i = 1; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println(cur);
                cur = "";
                cur += ch;
            } else {
                cur += ch;
            }
        }

        System.out.print(cur);
    }
}

// IAmAJavaProgrammer