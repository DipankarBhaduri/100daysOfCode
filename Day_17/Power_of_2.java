package Day_17;

import java.util.*;

public class Power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print(check_power_of_2(n));
    }

    public static boolean check_power_of_2(int n) {
        if (n == 2 || n == 0 || n == 8 || n == 4 || n == 16 || n == 32) {
            return true;
        }

        if (n < 32) {
            return false;
        }

        if (n % 2 == 0 && n % 4 == 0 && n % 16 == 0 && n % 32 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
