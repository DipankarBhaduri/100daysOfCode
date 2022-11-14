package Day_29;

import java.util.*;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sc.close();
        if (check_palindrome(s)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

    public static boolean check_palindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;
        char start_char, end_char;
        while (start < end) {
            start_char = s.charAt(start);
            end_char = s.charAt(end);
            if (!Character.isLetterOrDigit(start_char)) {
                start++;
            } else if (!Character.isLetterOrDigit(end_char)) {
                end--;
            } else {
                if (Character.toLowerCase(start_char) != Character.toLowerCase(end_char)) {
                    return false;
                }

                start++;
                end--;
            }
        }

        return true;
    }

}
