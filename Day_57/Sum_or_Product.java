package Day_57;

import java.util.*;

public class Sum_or_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long q = sc.nextLong();

        sc.close();
        long ans = perfrom_product_or_sum(n, q);
        System.out.print(ans);

    }

    static long perfrom_product_or_sum(long n, long q) {
        if (q == 1) {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        } else {
            long sum = 1;
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            return sum;
        }
    }
}
