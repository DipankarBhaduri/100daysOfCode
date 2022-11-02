package Day_17;

import java.util.*;

public class Reverse_words_in_a_given_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String ans = reverse_word(s);
        System.out.print(ans);
    }

    public static String reverse_word(String str) {
        int n = str.length();
        Stack<String> stk = new Stack<>();

        String s = "";

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '.') {
                stk.push(s);
                s = "";
            } else {
                s += ch;
            }
        }

        stk.push(s);
        s = "";
        String sadd = ".";

        while (!stk.isEmpty()) {
            s += stk.peek();
            stk.pop();

            if (!stk.isEmpty()) {
                s += sadd;
            }
        }
        return s;
    }
}
