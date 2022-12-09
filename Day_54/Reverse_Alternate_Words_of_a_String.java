package Day_54;

import java.util.*;

public class Reverse_Alternate_Words_of_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sc.close();
        String ans = Reverse_Alternate_Word(s);
        System.out.print(ans);
    }

    public static String Reverse_Alternate_Word(String s) {
        int idx = 0;
        int n = s.length();

        String result = "";
        String cur = "";
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                idx++;

                while (!stk.isEmpty()) {
                    cur += stk.peek();
                    stk.pop();
                }

                result += cur;
                result += ' ';
                cur = "";
            }

            if (idx % 2 == 0) {
                if (ch != ' ') {
                    stk.push(ch);
                }
            } else {
                if (ch != ' ') {
                    cur += ch;
                }
            }
        }

        while (!stk.isEmpty()) {
            cur += stk.peek();
            stk.pop();
        }

        result += cur;
        result += ' ';
        cur = "";

        return result;

    }
}
