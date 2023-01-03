package Day_79_Stack;

import java.util.*;

public class valid_parentheses {

    static boolean valid_parentheses_checker(String s) {
        Stack<Character> s1 = new Stack<>();
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '(') {
                    s1.push(')');
                } else if (ch == '{') {
                    s1.push('}');
                } else if (ch == '[') {
                    s1.push(']');
                } else {
                    if (s1.size() > 0) {
                        if (s1.peek() == ch) {
                            s1.pop();
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }

        if (s1.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean b = valid_parentheses_checker(s);
        if (b) {
            System.out.print("Valid");
        } else {
            System.out.print("Invalid");
        }
        sc.close();
    }
}
