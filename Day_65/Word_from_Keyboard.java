package Day_65;

import java.util.*;

public class Word_from_Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        sc.close();
        find_Word_from_Keyboard(arr);
    }

    static void find_Word_from_Keyboard(String[] arr) {
        HashSet<Character> row1 = new HashSet<>();
        HashSet<Character> row2 = new HashSet<>();
        HashSet<Character> row3 = new HashSet<>();

        // set_1
        row1.add('q');
        row1.add('w');
        row1.add('e');
        row1.add('r');
        row1.add('t');
        row1.add('y');
        row1.add('u');
        row1.add('i');
        row1.add('o');
        row1.add('p');

        // set_2
        row2.add('a');
        row2.add('s');
        row2.add('d');
        row2.add('f');
        row2.add('g');
        row2.add('h');
        row2.add('j');
        row2.add('k');
        row2.add('l');

        // set_3
        row3.add('z');
        row3.add('x');
        row3.add('c');
        row3.add('v');
        row3.add('b');
        row3.add('n');
        row3.add('m');

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            int n = s.length();
            int idx = 0;

            int row1Count = 0;
            int row2Count = 0;
            int row3Count = 0;

            while (idx < n) {
                char ch = s.charAt(idx);
                if (row1.contains(ch)) {
                    row1Count++;
                }

                if (row2.contains(ch)) {
                    row2Count++;
                }

                if (row3.contains(ch)) {
                    row3Count++;
                }

                idx++;
            }

            if (row1Count == n || row2Count == n || row3Count == n) {
                System.out.println(s);
            }
        }
    }
}
