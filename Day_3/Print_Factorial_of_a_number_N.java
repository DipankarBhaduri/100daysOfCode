package Day_3;

import java.util.*;

public class Print_Factorial_of_a_number_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial_of_n(n);
        System.out.println("The factorial of n number is : " + result);

    }

    public static int factorial_of_n(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = factorial_of_n(n - 1);
        int ans = n * fact;
        return ans;
    }
}
