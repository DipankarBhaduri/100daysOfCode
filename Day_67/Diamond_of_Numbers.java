package Day_67;

import java.util.*;

public class Diamond_of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_diamond(n);
        sc.close();
    }

    public static void print_diamond(int n) {

        if (n % 2 == 0) {
            for (int i = 1; i <= n; i = i + 2) {
                int idx = 1;
                int num = 1;
                for (int j = i; j < (n + 1) / 2 - num++; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    if (idx == 10) {
                        idx = 1;
                    }
                    System.out.print(idx++);
                }

                System.out.println();
            }

            if (n % 2 == 0) {
                int idx = 1;
                for (int i = 0; i <= n; i++) {

                    if (idx == 10) {
                        idx = 1;
                    }
                    System.out.print(idx++);
                }
                System.out.println();
            }

            for (int i = n; i >= 1; i = i - 2) {
                int idx = 1;
                for (int j = i; j <= n + 1; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k < i; k++) {
                    if (idx == 10) {
                        idx = 1;
                    }
                    System.out.print(idx++);
                }

                System.out.println();
            }
        } else {

            for (int i = 1; i <= n; i = i + 2) {
                int idx = 1;
                for (int j = 1; j < n / 2 - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    if (idx == 10) {
                        idx = 1;
                    }
                    System.out.print(idx++);
                }

                System.out.println();
            }

            for (int i = n - 2; i >= 1; i = i - 2) {
                int idx = 1;
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    if (idx == 10) {
                        idx = 1;
                    }
                    System.out.print(idx++);
                }
                System.out.println();
            }
        }
    }
}
