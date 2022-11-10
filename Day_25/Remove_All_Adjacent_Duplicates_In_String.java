package Day_25;

import java.util.*;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = Remove_All_Adjacent_Duplicates_from_the_String(s);
        System.out.print(ans);
    }

    public static String Remove_All_Adjacent_Duplicates_from_the_String(String s) {
        int i = 0, n = s.length();
        char[] res = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            res[i] = res[j];
            if (i > 0 && res[i - 1] == res[i]) // count = 2
                i -= 2;
        }
        return new String(res, 0, i);
    }
}
