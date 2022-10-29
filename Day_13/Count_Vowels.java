package Day_13;

import java.util.*;

public class Count_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        count_upper_lower_digit(s);
    }

    public static void count_upper_lower_digit(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.print(count);
    }
}
