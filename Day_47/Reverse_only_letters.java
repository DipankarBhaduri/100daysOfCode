package Day_47;

import java.util.Stack;

public class Reverse_only_letters {
    public static void main(String[] args) {

    }
}

class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> stk = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                stk.push(ch);
            }
        }

        char c[] = new char[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char val = s.charAt(i);

            if (val >= 'a' && val <= 'z' || val >= 'A' && val <= 'Z') {
                c[idx++] = stk.pop();
            } else {
                c[idx++] = val;
            }
        }

        String ans = new String(c);
        return ans;
    }
}