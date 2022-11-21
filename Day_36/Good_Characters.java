package Day_36;

import java.util.*;

public class Good_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            String keystring = sc.next();
            String target = sc.next();
            int ans = Good_Characters_1(keystring, target);
            System.out.println(ans);
        }

        sc.close();
    }

    public static int Good_Characters_1(String keystring, String target) {
        int n = target.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = target.charAt(i);
            if (map.containsKey(ch)) {
                int value = map.get(ch);
                map.put(ch, value + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int matchCount = 0;

        for (int i = 0; i < keystring.length(); i++) {
            char ch = keystring.charAt(i);
            if (map.containsKey(ch)) {
                int value = map.get(ch);
                matchCount += value;
                map.remove(ch);
            }
        }
        return matchCount;
    }
}
