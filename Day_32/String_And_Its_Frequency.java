package Day_32;

import java.util.*;

public class String_And_Its_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        sc.close();
        String ans = return_the_character_frequency(str);
        System.out.print(ans);
    }

    public static String return_the_character_frequency(String str) {
        int n = str.length();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int value = map.get(ch);
                map.put(ch, value + 1);
            } else {
                map.put(ch, 1);
            }
        }
        String ans = "";

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            String temp = "";
            if (map.containsKey(ch)) {
                int val = map.get(ch);
                temp += ch;
                temp += Integer.toString(val);
                ans += temp;
                map.remove(ch);
            }
        }

        return ans;
    }
}
