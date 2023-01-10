package Day_86;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution s = new Solution();
        Boolean b = s.isValid(str);
        System.out.print(b);
        sc.close();
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        int n = s.length();
        if (s.length() % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '(') {
                    stk.push(')');
                } else if (ch == '{') {
                    stk.push('}');
                } else if (ch == '[') {
                    stk.push(']');
                } else {
                    if (stk.size() > 0) {
                        if (stk.peek() == ch) {
                            stk.pop();
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }

        if (stk.size() != 0) {
            return false;
        } else {
            return true;
        }
    }
}