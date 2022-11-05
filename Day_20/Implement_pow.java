package Day_20;

import java.util.*;

public class Implement_pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt(); // --------------->> ((x^n)%d)

        sc.close();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * x;
        }

        long result = ans % d;
        System.out.print(result);

    }
}
