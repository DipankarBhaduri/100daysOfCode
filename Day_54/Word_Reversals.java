package Day_54;

import java.util.*;

public class Word_Reversals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sc.close();
        String ans = perfrom_word_reverse(s);
        System.out.print(ans);
    }

    public static String perfrom_word_reverse(String s) {
        Stack<Character> stk = new Stack<>();
        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                while (!stk.empty()) {
                    char ch1 = stk.peek();
                    ans += ch1;
                    stk.pop();
                }
                ans += ' ';
            } else {
                stk.push(ch);
            }

            if (i == n - 1) {
                while (!stk.empty()) {
                    char ch1 = stk.peek();
                    ans += ch1;
                    stk.pop();
                }
            }
        }

        return ans;

    }
}
