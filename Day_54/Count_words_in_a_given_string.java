package Day_54;

import java.util.*;

public class Count_words_in_a_given_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sc.close();
        int ans = count_words(s);
        System.out.print(ans);
    }

    public static int count_words(String s) {
        if (s == null || s == "") {
            return 0;
        }

        String cur = "";
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ' && cur != "") {
                count++;
                cur = "";
            } else if (ch != ' ') {
                cur += ch;
            }
        }

        return count;

    }
}
