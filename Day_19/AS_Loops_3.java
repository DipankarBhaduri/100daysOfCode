package Day_19;

import java.util.*;

public class AS_Loops_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();
        all_the_Perfect_Numbers(num1, num2);
    }

    public static void all_the_Perfect_Numbers(int num1, int num2) {

        for (int i = num1; i <= num2; i++) {
            if (helper_of_perfect_number_print(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean helper_of_perfect_number_print(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }

    }
}
