package Day_20;

import java.util.*;

public class Even_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        long sum = calculate_the_even_sum(n);
        System.out.print(sum);
    }

    public static long calculate_the_even_sum(int n) {
        if (n < 2) {
            return 0;
        }
        if (n < 4) {
            return 2;
        }

        long sum = 0;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
