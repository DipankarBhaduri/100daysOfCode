package Day_13;

import java.util.*;

public class reversing_the_string_word_by_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String ans = reversed_the_string(s);
        System.out.print(ans);
    }

    public static String reversed_the_string(String s) {
        int n = s.length();
        Stack<String> stk = new Stack<>();
        String str = "";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                stk.push(str);
                str = "";
            } else {
                if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                    str += ch;
                }
            }
        }

        stk.push(str);
        str = "";
        StringBuilder sb = new StringBuilder("");

        while (!stk.isEmpty()) {
            sb.append(stk.peek());
            stk.pop();

            if (!stk.isEmpty()) {
                sb.append(" ");

            }
        }
        return sb.toString();
    }
}
