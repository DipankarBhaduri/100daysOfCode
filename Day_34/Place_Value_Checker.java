package Day_34;

import java.util.*;

public class Place_Value_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        boolean b = zero_at_second_last_place(n);
        if (b) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean zero_at_second_last_place(int n) {
        if (n < 10) {
            return true;
        }
        if (n < 99 && n > 9) {
            return false;
        }

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            if (count == 2) {
                if (rem == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        return false;
    }
}
