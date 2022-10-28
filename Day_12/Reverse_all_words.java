/*
Given a string, reverse each word in the sentence.
Input :-->  Welcome to this Javascript Guide!
Output :-->  emocleW ot siht tpircsavaJ !ediuG
 */

package Day_12;

import java.util.*;

public class Reverse_all_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String result = reversed_the_word(s);
        System.out.print(result);

    }

    public static String reversed_the_word(String s) {
        String str = "";
        Queue<String> q = new LinkedList<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                q.add(str);
                str = "";
            } else {
                str += ch;
            }
        }

        q.add(str);
        str = "";
        str = helper(q);
        return str;
    }

    public static String helper(Queue<String> q) {
        String final_ans = "";

        while (!q.isEmpty()) {
            String s = q.poll();
            int n = s.length();
            for (int i = n - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                final_ans += ch;
            }
            final_ans += ' ';
        }

        String ans = final_ans.substring(0, final_ans.length() - 1);
        return ans;

    }
}
