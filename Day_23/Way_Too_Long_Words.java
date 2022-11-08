package Day_23;

import java.util.*;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            String ans = calculate_the_way_to_long_word(s);
            System.out.println(ans);
        }
        sc.close();
    }

    static String calculate_the_way_to_long_word(String s) {
        int n = s.length();
        String ans = "";

        if (n <= 10) {
            return s;
        } else {
            char ch1 = s.charAt(0);
            char ch2 = s.charAt(n - 1);
            int num = n - 2;
            String numString = Integer.toString(num);
            ans += ch1;
            ans += numString;
            ans += ch2;
        }
        return ans;
    }
}
