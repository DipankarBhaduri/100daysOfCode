package Day_65;

import java.util.*;

public class Sort_Characters_By_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = Sort_Characters_by_fre(s);
        System.out.print(ans);

    }

    static String Sort_Characters_by_fre(String s) {
        if (s.length() < 2) {
            return s;
        }

        StringBuilder sb = new StringBuilder("");
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int val = map.get(ch);
                map.put(ch, val + 1);
            } else {
                map.put(ch, 1);
            }
        }

        char ch1 = ' ';
        int fre = 0;
        int n = map.size();

        while (n-- > 0) {
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (fre < e.getValue()) {
                    fre = e.getValue();
                    ch1 = e.getKey();
                }

                if (fre == e.getValue() && ch1 < e.getKey()) {
                    ch1 = e.getKey();
                }
            }

            map.remove(ch1);
            for (int i = 1; i <= fre; i++) {
                sb.append(ch1);
            }
        }

        return sb.toString();
    }
}
