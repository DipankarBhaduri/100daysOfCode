package Day_20;

import java.util.*;

public class Print_All_Prime_Numbers_in_range_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        Print_all_prime_number(n);
    }

    public static void Print_all_prime_number(int n) {

        for (int i = 2; i <= n; i++) {
            if (check_prime_or_not(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean check_prime_or_not(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }
}
