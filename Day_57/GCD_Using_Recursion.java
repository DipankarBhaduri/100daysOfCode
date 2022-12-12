package Day_57;

import java.util.*;

public class GCD_Using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        sc.close();
        int ans = find_GCD(n1, n2);
        System.out.println(ans);
    }

    static int find_GCD(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }

        if (n2 == 0) {
            return n1;
        }

        int ans = 1;

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ans = i;
            }
        }

        return ans;
    }
}
