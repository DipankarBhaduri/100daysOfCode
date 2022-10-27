package Day_11;

import java.util.*;

public class Calculte_te_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = calculate(n);
        System.out.print(ans);
        sc.close();

    }

    public static int calculate(int n) {
        if (n <= 100) {
            return n * 10;
        } else if (n > 100 && n <= 200) {
            return ((100 * 10) + ((n - 100) * 15));
        } else if (n > 200 && n <= 300) {
            return ((100 * 10) + (100 * 15) + ((n - 200) * 20));
        } else {
            return ((100 * 10) + (100 * 15) + (100 * 20) + ((n - 300) * 25));
        }

    }
}

/*
 * Charge for the first 100 units – 10*100 = 1000
 * Charge for the 100 to 200 units – 15*100 = 1500
 * Charge for the 200 to 250 units – 20*50 = 1000
 * Total Electricity Bill = 1000 + 1500 + 1000 = 3500
 */