package Day_3;

import java.util.*;

public class Print_x_to_the_power_n_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 2;
        int n = sc.nextInt();
        int result = print_x_to_the_power_n(x, n);

        System.out.print("The value of " + x + "^" + n + " is : " + result);
    }

    public static int print_x_to_the_power_n(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int ans1 = print_x_to_the_power_n(x, n - 1);
        int ans2 = x * ans1;
        return ans2;
    }
}
