package Day_19;

import java.util.*;

public class Print_Reverse_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        print_star(n);
    }

    public static void print_star(int n) {

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
