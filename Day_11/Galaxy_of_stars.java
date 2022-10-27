package Day_11;

import java.util.*;

public class Galaxy_of_stars {
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

        if (n == 3) {
            System.out.println("*");
            System.out.println("**");
            System.out.println("*");
            return;
        }

        int k = n / 2;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= k + 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
