package Day_1;

import java.util.*;

public class Convert_Integer_to_Roman_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans1 = Integer_to_roman(n);
        System.out.print(ans1);
    }

    public static String Integer_to_roman(int n) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] str = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                n = n - values[i];
                sb.append(str[i]);
            }
        }

        String ans = sb.toString();
        return ans;
    }
}
