package Day_16;

import java.util.*;

public class Reverse_Alternate_Words_of_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sc.close();
        String ans = reverse_alternate_word(s);
        System.out.print(ans);
    }

    public static String reverse_alternate_word(String s) {
        int n = s.length();
        int count = 0;
        String F_ans = "";
        String str = "";
        String result = "";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (count % 2 == 0) {
                    result = reverse_word_helper(str);
                    F_ans = result + " ";
                }
                count++;
            } else {
                F_ans = F_ans + str + " ";
                str = "";
                str += ch;
            }
        }
        return F_ans;
    }

    public static String reverse_word_helper(String s) {
        int n = s.length();
        String cur = "";

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            cur += ch;
        }

        return cur;
    }
}
