package Day_54;

import java.util.*;

public class Prime_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print_prime_factor(n);
    }

    static void print_prime_factor(int n) {
        if (n < 4) {
            System.out.print(n);
            return;
        }

        while (n > 1) {
            int cal = 1;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    cal = i;
                    break;
                }
            }
            n = n / cal;
        }
    }
}
