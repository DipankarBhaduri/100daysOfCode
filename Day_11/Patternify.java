package Day_11;

import java.util.*;

public class Patternify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print_info(n);

    }

    public static void print_info(int n) {
        if (n == 1) {
            System.out.print("*");
            return;
        }

        if (n == 2) {
            System.out.println("*");
            System.out.println("**");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
