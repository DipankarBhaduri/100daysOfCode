package Day_16;

import java.util.*;

public class AS_All_Armstrongs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        print_all_armstrong(num1, num2);

    }

    public static void print_all_armstrong(int num1, int num2) {
        if (num1 < 10) {
            for (int i = num1; i <= 9; i++) {
                System.out.print(i + " ");
            }
        }

        for (int i = 10; i <= num2; i++) {
            if (print_helper(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean print_helper(int n) {
        int temp = n;
        int ans = 0;
        int fans = 0;

        while (temp > 0) {
            ans = temp % 10;
            fans += (ans * ans * ans);
            temp = temp / 10;
        }

        if (n == fans) {
            return true;
        } else {
            return false;
        }

    }
}
