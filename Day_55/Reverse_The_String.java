package Day_55;

import java.util.*;

public class Reverse_The_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sc.close();
        String ans = print_all_word_in_reverse(s);
        System.out.print(ans);
    }

    static String print_all_word_in_reverse(String s) {
        Stack<String> stk = new Stack<>();
        String cur = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (cur != "") {
                    stk.push(cur);
                    cur = "";
                }
            } else {
                cur += ch;
            }
        }

        stk.push(cur);
        cur = "";
        while (!stk.isEmpty()) {
            String val = stk.pop();
            cur += val;

            if (!stk.isEmpty()) {
                cur += ' ';
            }
        }

        return cur;

    }
}
