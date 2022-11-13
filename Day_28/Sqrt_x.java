package Day_28;

import java.util.*;

public class Sqrt_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        sc.close();
        int ans = mySqrt(number);
        System.out.print(ans);
    }

    public static int mySqrt(int x) {
        double n = Math.sqrt(x);
        System.out.print(n);
        return (int) (Math.floor(n));
    }
}
