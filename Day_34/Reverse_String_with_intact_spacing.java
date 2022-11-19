package Day_34;

import java.util.*;

public class Reverse_String_with_intact_spacing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase > 0) {
            String s = sc.nextLine();
            String ans = reverse_the_string_incuding_space(s);
            System.out.println(ans);
            testcase--;
        }
        sc.close();

    }

    public static String reverse_the_string_incuding_space(String s) {
        Stack<Integer> stk = new Stack<>();

        String str = "";
        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str += ch;
            } else {
                stk.push(i);
            }
        }

        if (stk.isEmpty()) {
            return str;
        }

        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i != stk.peek()) {
                ans += ch;
            } else {
                ans += ' ';
            }
        }

        return ans;

    }
}
