package Day_16;

import java.util.*;

public class Print_Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

    }
}
