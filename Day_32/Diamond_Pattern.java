package Day_32;

import java.util.*;

public class Diamond_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int n = sc.nextInt();
            print_diamond(n);
        }
        sc.close();
    }

    public static void print_diamond(int n) {

        if (n % 2 == 0) {
            for (int i = 1; i <= n; i = i + 2) {
                for (int j = i; j < n + 1; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

            if (n % 2 == 0) {
                for (int i = 0; i <= n; i++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            for (int i = n; i >= 1; i = i - 2) {
                for (int j = i; j <= n + 1; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k < i; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        } else {

            for (int i = 1; i <= n; i = i + 2) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

            for (int i = n - 2; i >= 1; i = i - 2) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}
