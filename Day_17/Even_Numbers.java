package Day_17;

import java.util.*;

public class Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            print_even_number(n);
            System.out.println();
        }

        sc.close();
    }

    public static void print_even_number(int n) {
        if (n == 0 || n == 1) {
            System.out.print(0);
        } else {

            for (int i = n; i >= 0; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
