package Day_55;

import java.util.*;

public class Remove_Characters_from_First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        sc.close();
        Remove_Characters_from_First_String(s1, s2);
    }

    public static void Remove_Characters_from_First_String(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        int n1 = s1.length();

        for (int i = 0; i < n1; i++) {
            char ch = s1.charAt(i);
            set.add(ch);
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (set.contains(ch)) {
                set.remove(ch);
            }
        }

        String ans = "";
        for (int i = 0; i < n1; i++) {
            char ch = s1.charAt(i);
            if (set.contains(ch)) {
                ans += ch;
            }
        }

        System.out.print(ans);

    }
}
