package Day_34;

import java.util.*;

public class Right_Arrow_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        print_star(n);
    }

    public static void print_star(int n) {
        for (int i = 0; i < (n / 2); i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 0; i < (n / 2); i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = (n / 2); k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

/*
 * n == 7
 * 
 * 
 * *
 * * *
 * * * * * * *
 * * *
 * *
 * 
 * 
 * 
 * 
 * 
 * *
 * * * * *
 * *
 * 
 * 
 * 
 */