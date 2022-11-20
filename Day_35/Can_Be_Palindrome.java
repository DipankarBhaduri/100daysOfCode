package Day_35;

import java.util.*;

public class Can_Be_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            String s = sc.next();

            Boolean b = Can_Be_Palindrome_or_Not(s);
            if (b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean Can_Be_Palindrome_or_Not(String s) {
        int n = s.length();
        if (n == 1) {
            return true;
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

        int Oddcount = 0;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 != 0) {
                Oddcount++;
            }
        }

        if (Oddcount > 1) {
            return false;
        } else {
            return true;
        }
    }
}
