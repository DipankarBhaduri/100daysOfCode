// Given a string str, find length of the longest substring with all distinct characters.
package Day_9;

import java.util.*;

public class Longest_Distinct_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = lengthOfLongestSubstring(str);
        System.out.print(ans);
        sc.close();

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
