package Day_30;

import java.util.*;

public class Yash_and_unique_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ans = ans ^ val;
        }

        sc.close();
        System.out.print(ans);
    }
}
