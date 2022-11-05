package Day_20;

import java.util.*;

public class Binary_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        print_binary_pattern(n);
    }

    public static void print_binary_pattern(int n) {
        int one = 1;
        int zero = 0;
        int count = 0;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (count % 2 == 0) {
                    System.out.print(one);
                } else {
                    System.out.print(zero);
                }
            }
            System.out.println();
            count++;
        }
    }
}
