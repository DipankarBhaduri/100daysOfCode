package Day_20;

import java.util.*;

public class Valid_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        if (check_anagram(s1, s2)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }

    public static boolean check_anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < s1.length(); i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }

        return true;
    }
}
