package Day_28;

import java.util.*;

public class Climbing_Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        int ans = climbStairs(n);
        System.out.print(ans);
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
