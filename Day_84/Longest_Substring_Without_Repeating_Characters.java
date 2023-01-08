package Day_84;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
    static int longest_substring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int i = 0;
        int j = 0;

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = longest_substring(s);
        System.out.print(ans);
    }
}
