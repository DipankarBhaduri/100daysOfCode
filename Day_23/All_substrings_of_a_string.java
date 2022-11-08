package Day_23;

import java.util.*;

public class All_substrings_of_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        print_all_substring(s);
    }

    public static void print_all_substring(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = i; j < n; j++) {
                str += s.charAt(j);
                System.out.println(str);
            }
        }
    }
}
