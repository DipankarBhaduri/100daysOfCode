package Day_13;

import java.util.*;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean ans = check_prime_helper(n);
        if (ans == true) {
            System.out.print(n + " is a prime number");
        } else {
            System.out.print(n + " is not a prime number");
        }
    }

    public static boolean check_prime_helper(int n) {
        if (n == 1 || n == 2 || n == 3 || n == 5 || n == 7) {
            return true;
        } else if (n == 4 || n == 6) {
            return false;
        } else {
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
                return false;
            }
        }
        return true;
    }
}
