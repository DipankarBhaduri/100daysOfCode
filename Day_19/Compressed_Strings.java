package Day_19;

import java.util.*;

public class Compressed_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            String ans = String_compressed(s);
            System.out.println(ans);
        }
        sc.close();
    }

    public static String String_compressed(String s) {
        int n = s.length();

        if (n == 1) {
            return s;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int value = map.get(ch);
                map.put(ch, value + 1);
            } else {
                map.put(ch, 1);
            }
        }

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            if (map.containsKey(ch1)) {
                int value = map.get(ch1);
                if (value != 1) {
                    String c = "";
                    c += ch1;
                    String f = Integer.toString(value);
                    c += f;
                    sb.append(c);
                } else {
                    sb.append(ch1);
                }
            }
            map.remove(ch1);
        }

        String ans = sb.toString();
        return ans;
    }
}
