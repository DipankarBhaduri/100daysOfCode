package Day_28;

import java.util.*;

public class Crazy_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        print_pattern(n);
    }

    public static void print_pattern(int n) {
        int idx = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (idx == 10) {
                    idx = 1;
                }
                System.out.print(idx);
                idx++;
            }
            System.out.println();
        }
    }
}
