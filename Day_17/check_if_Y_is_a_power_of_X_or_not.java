package Day_17;

import java.util.*;

public class check_if_Y_is_a_power_of_X_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        System.out.print(check_y_is_power_of_x_or_not(x, y));
    }

    public static int check_y_is_power_of_x_or_not(int x, int y) {
        if (x == 1 && y > 1) {
            return 0;
        }

        if (x == 1 && y == 1) {
            return 1;
        }

        if (x == y) {
            return 1;
        }

        int ans = 1;
        while (ans < y) {
            ans = ans * x;
            if (ans == y) {
                return 1;
            }

        }
        return 1;
    }
}
