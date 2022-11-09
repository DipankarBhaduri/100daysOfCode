package Day_24;

import java.util.*;

public class print_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        sc.close();
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        long ans = (long) num1 * num2;

        String result = Long.toString(ans);
        System.out.printf(result);
    }
}
