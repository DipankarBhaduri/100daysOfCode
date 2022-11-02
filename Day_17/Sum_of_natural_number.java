package Day_17;

import java.util.*;

public class Sum_of_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print(sum_of_natural(n));
    }

    public static long sum_of_natural(int n) {
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }

        return ans;
    }
}
