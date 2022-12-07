package Day_52;

import java.util.*;

public class Valid_Parentheses {
    public static void main(String[] args) {

    }
}

class Solution {
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        Stack<Character> st = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.add(c);
            } else {
                if (st.isEmpty())
                    return false;
                if (c == ']' && st.peek() != '[')
                    return false;
                if (c == ')' && st.peek() != '(')
                    return false;
                if (c == '}' && st.peek() != '{')
                    return false;

                st.pop();
            }

        }
        return st.isEmpty();
    }
}
