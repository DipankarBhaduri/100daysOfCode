package Day_34;

import java.util.*;

public class PrintStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        printStar(n);
    }

    public static void printStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}