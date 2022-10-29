package Day_13;

import java.util.*;

public class Count_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        count_upper_lower_digit(s);
    }

    public static void count_upper_lower_digit(String s) {
        int n = s.length();
        int upper = 0, lower = 0, digit = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                digit++;
            }

        }

        System.out.print(upper + " " + lower + " " + digit);
    }
}
