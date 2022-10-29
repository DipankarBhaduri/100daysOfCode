package Day_13;

import java.util.*;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (valid_square(n)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }

    public static boolean valid_square(int n) {
        if (n == 1 || n == 4) {
            return true;
        }

        if (n == 2 || n == 3 || n == 5 || n == 6 || n == 7) {
            return false;
        }

        for (int i = 3; i < n / 2; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;

    }
}
