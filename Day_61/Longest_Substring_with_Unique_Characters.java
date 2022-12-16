package Day_61;

import java.util.*;

public class Longest_Substring_with_Unique_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sc.close();
        int ans = find_Longest_Substring_with_Unique_Characters(s);
        System.out.print(ans);

    }

    static int find_Longest_Substring_with_Unique_Characters(String s) {

        int longest = 0;
        HashSet<Character> set = new HashSet<>();
        int n = s.length();

        int start = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                if (!set.contains(ch)) {
                    set.add(ch);
                    longest = Math.max(longest, set.size());
                } else {
                    while (set.contains(ch)) {
                        char cur = s.charAt(start++);
                        set.remove(cur);
                    }
                    set.add(ch);
                }
            }
        }

        return longest;
    }
}
