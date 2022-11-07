package Day_22_oops;

import java.util.*;

public class Word_Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.next();
        }
        String target = sc.next();
        sc.close();
        if (check_word_break(arr, target)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

    static boolean check_word_break(String[] arr, String target) {
        int idx = 0;

        while (idx < target.length()) {
            char ch1 = target.charAt(idx);
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                String cur = arr[i];
                char ch2 = cur.charAt(0);
                if (ch1 == ch2) {
                    int received = helper_of_word_break_checking(cur, target, idx);
                    idx = received;
                } else {
                    count++;
                }
            }
            if (count == arr.length - 1) {
                return false;
            }
        }
        return true;
    }

    static int helper_of_word_break_checking(String element, String target, int idx) {
        int elementLength = element.length();
        int copy = idx;

        for (int i = 0; i < elementLength; i++) {
            char ch = element.charAt(i);
            if (ch != target.charAt(copy++)) {
                return idx;
            }
        }

        return copy;
    }
}
