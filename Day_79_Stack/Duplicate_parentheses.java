package Day_79_Stack;

import java.util.*;

public class Duplicate_parentheses {
    static boolean duplicate_parentheses_checker(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                int counter = 0;
                while (stack.peek() != '(') {
                    counter++;
                    stack.pop();
                }
                if (counter > 0) {
                    stack.pop();
                } else {
                    return true;
                }
            } else {
                stack.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean b = duplicate_parentheses_checker(s);
        if (b) {
            System.out.print("Duplicate present");
        } else {
            System.out.print("No duplicate are present");
        }

        sc.close();
    }
}
