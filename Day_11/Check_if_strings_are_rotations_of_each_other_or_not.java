package Day_11;

import java.util.*;

public class Check_if_strings_are_rotations_of_each_other_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();

        int ans = check_the_string(str1, str2);
        System.out.print(ans);
    }

    public static int check_the_string(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return 0;
        }

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return 0;
            }
        }

        return 1;

    }
}
