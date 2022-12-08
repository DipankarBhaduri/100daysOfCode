package Day_53;

import java.util.*;

public class Substring_With_K_Unique_characters {

    public static int longestkSubstr(int n, int k, String s) {

        if (k == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxSize = 0;

        while (end < n) {
            char ch = s.charAt(end);
            char ch1 = s.charAt(start);

            if (map.size() < k) {
                if (map.containsKey(ch)) {
                    int val = map.get(ch);
                    map.put(ch, val + 1);
                } else {
                    map.put(ch, 1);
                }

                end++;

            } else {
                int value = map.get(ch1);
                if (value == 1) {
                    map.remove(ch1);
                } else {
                    map.put(ch1, value - 1);
                }
                start++;

            }

            maxSize = Math.max(maxSize, end - start + 1);
        }

        return maxSize;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int ans = longestkSubstr(n, k, s);
        System.out.println(ans);
    }
}