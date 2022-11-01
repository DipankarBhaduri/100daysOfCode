package Day_16;

import java.util.*;

public class Minimum_Parantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int ans = Minimum_Paranthese(s);
        System.out.print(ans);
    }

    public static int Minimum_Paranthese(String s) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stk1.push('(');
            }

            if (ch == ')') {
                stk2.push(')');
            }
        }

        int s1 = stk1.size();
        int s2 = stk2.size();
        int ans = 0;
        if (s1 > s2) {
            ans = s1 - s2;
        } else {
            ans = s2 - s1;
        }

        return ans;
    }
}
