package Day_27;

import java.util.*;

public class Valid_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        if (check_valid_parentheses(s)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

    public static boolean check_valid_parentheses(String s) {
        Stack<Character> stk = new Stack<>();
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }

        for (int i = 0; i < n; i++) { // --------------->>>>>> (){}[]{[()]}
            char ch = s.charAt(i);
            if (ch == '(') {
                stk.push(')');
            } else if (ch == '{') {
                stk.push('}');
            } else if (ch == '[') {
                stk.push(']');
            } else {
                if (stk.size() > 0) {
                    if (ch == stk.peek()) {
                        stk.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (stk.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
