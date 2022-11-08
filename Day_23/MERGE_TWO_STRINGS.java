package Day_23;

import java.util.*;

public class MERGE_TWO_STRINGS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        sc.close();
        String result = perfrom_the_merged_of_two_string(s1, s2);
        System.out.print(result);
    }

    static String perfrom_the_merged_of_two_string(String s1, String s2) {

        String result = "";
        int n1 = s1.length();
        int n2 = s2.length();
        int first = 0;
        int second = 0;

        if (s1.length() == 0 && s2.length() != 0) {
            return s2;
        }
        if (s1.length() != 0 && s2.length() == 0) {
            return s1;
        }
        if (s1.length() == 0 && s2.length() == 0) {
            return result;
        }

        while (first < n1 && second < n2) {
            char ch1 = s1.charAt(first++);
            result += ch1;
            char ch2 = s2.charAt(second++);
            result += ch2;
        }

        while (first < n1) {
            char ch1 = s1.charAt(first++);
            result += ch1;
        }

        while (second < n2) {
            char ch2 = s2.charAt(second++);
            result += ch2;
        }

        return result;
    }
}
