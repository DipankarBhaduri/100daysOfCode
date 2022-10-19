/*
Given a string, compute recursively a new string where identical chars that are adjacent
 in the original string are separated from each other by a "*".

Input : hello
Output : hel*lo

*/

package Day_3;

import java.util.*;

public class PairStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String ans = separated_from_each_other_by_star(str);
        System.out.print(ans);
    }

    public static String separated_from_each_other_by_star(String str) {
        int n = str.length();
        if (n == 1) {
            return str;
        }

        Stack<Character> stk = new Stack<>();
        Stack<Character> stk1 = new Stack<>();

        stk.push(str.charAt(0));
        for (int i = 1; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == stk.peek()) {
                stk.push('*');
                stk.push(ch);
            } else {
                stk.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder("");
        while (!stk.isEmpty()) {
            stk1.push(stk.peek());
            stk.pop();
        }

        while (!stk1.isEmpty()) {
            sb.append(stk1.peek());
            stk1.pop();
        }

        return sb.toString();
    }
}
