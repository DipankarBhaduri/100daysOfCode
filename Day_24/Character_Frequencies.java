package Day_24;

import java.util.*;

public class Character_Frequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        print_character_frequency(s);
    }

    public static void print_character_frequency(String s) {
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

        System.out.println(map.size());

        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            if (map.containsKey(ch1)) {
                System.out.print(map.get(ch1) + " ");
                map.remove(ch1);
            }
        }
    }
}
