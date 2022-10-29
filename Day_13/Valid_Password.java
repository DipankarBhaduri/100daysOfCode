package Day_13;

import java.util.*;

public class Valid_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.print(password_checker(s));

    }

    public static boolean password_checker(String s) {
        if (s.length() < 8) {
            return false;
        }

        if (s.length() > 15) {
            return false;
        }

        int digit = 0;
        int lowercase = 0;
        int uppercase = 0;
        int specialChar = 0;

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digit++;
            }

            if (ch >= 'a' && ch <= 'z') {
                lowercase++;
            }

            if (ch >= 'A' && ch <= 'Z') {
                uppercase++;
            }

            if (ch == '@' || ch == '#' || ch == '%' || ch == '&' || ch == '!' || ch == '$' || ch == '*') {
                specialChar++;
            }
        }

        if (digit > 0 && lowercase > 0 && uppercase > 0 && specialChar > 0) {
            return true;
        }

        return false;
    }
}
