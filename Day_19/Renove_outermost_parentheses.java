package Day_19;

import java.util.*;

public class Renove_outermost_parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        sc.close();
        String ans = removeOuterParentheses(s, n);
        System.out.print(ans);

    }

    public static String removeOuterParentheses(String S, int n) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '(') {
                if (stack.size() > 0) {
                    ans.append(ch);
                }
                stack.push(ch);
            } else {
                if (stack.size() > 1) {
                    ans.append(ch);
                }
                stack.pop();
            }
        }
        return ans.toString();
    }

}
