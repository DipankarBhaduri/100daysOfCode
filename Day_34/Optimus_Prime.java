package Day_34;

import java.util.*;

public class Optimus_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        print_all_prime_number(n);
    }

    public static void print_all_prime_number(int n) {
        for (int i = 2; i <= n; i++) {
            boolean b = helper_of_prime_number(i);
            if (b) {
                System.out.println(i);
            }
        }
    }

    public static boolean helper_of_prime_number(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
