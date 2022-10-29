package Day_13;

import java.util.*;

public class length_of_last_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int ans = last_word_length(s);
        System.out.print(ans);

    }

    public static int last_word_length(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        if (n == 1 && s.charAt(0) != ' ') {
            return 1;
        }

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                return count;
            } else {
                count++;
            }

        }
        return count;
    }
}
