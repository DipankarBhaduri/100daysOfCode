package Day_47;

import java.util.*;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        sc.close();
        System.out.print(stringComparison(s1, s2));
    }

    static int stringComparison(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.equals(s2)) {
            return 0;
        } else {
            if (s1.compareTo(s2) < 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
