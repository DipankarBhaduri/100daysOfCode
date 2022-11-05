package Day_20;

import java.util.*;

public class PALINDROMIC_PERMUTATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        if (check_rearranged_into_a_palindrome(s)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    public static boolean check_rearranged_into_a_palindrome(String s) {
        int n = s.length();
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

        int odd = 0;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 != 0) {
                odd++;
            }
        }

        if (odd > 1) {
            return false;
        } else {
            return true;
        }
    }
}
