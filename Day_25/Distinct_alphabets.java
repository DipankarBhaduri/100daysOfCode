package Day_25;

import java.util.*;

public class Distinct_alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sc.close();
        distinct_alphabets_counts(s);
    }

    public static void distinct_alphabets_counts(String s) {
        int[] arr = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) { // ----> newton school
            char ch = s.charAt(i);
            if (ch != ' ') {
                int value = ch - 'a';
                arr[value] = arr[value] + 1;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
