package Day_26;

import java.util.*;

public class Roman_Numeral_To_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();
            int ans = convert_roman_to_initeger(str);
            System.out.println(ans);
        }
        sc.close();
    }

    public static int convert_roman_to_initeger(String str) {
        int ans = 0, num = 0;
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }

            if (4 * num < ans) {
                ans -= num;
            } else {
                ans += num;
            }
        }

        return ans;
    }
}
