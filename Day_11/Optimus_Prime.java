package Day_11;

import java.util.*;

public class Optimus_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prime_num(n);
        sc.close();
    }

    public static void Prime_num(int n) {
        if (n < 2) {
            return;
        }
        if (n == 2) {
            System.out.println(2);
            return;
        }
        if (n == 3 || n == 4) {
            System.out.println(2);
            System.out.println(3);
            return;
        }
        if (n == 5) {
            System.out.println(2);
            System.out.println(3);
            System.out.println(5);
            return;
        }

        System.out.println(2);
        System.out.println(3);
        System.out.println(5);
        for (int i = 6; i < n; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
