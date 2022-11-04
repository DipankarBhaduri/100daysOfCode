package Day_19;

import java.util.*;

public class Power_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            long ans = calculate_to_the_power(num1, num2);
            System.out.println(ans);
        }
        sc.close();
    }

    public static long calculate_to_the_power(int num1, int num2) {
        int ans = 1;

        if (num2 == 0) {
            return 1;
        }
        if (num2 == 1) {
            return num1;
        }

        for (int i = 1; i <= num2; i++) {
            ans *= num1;
        }

        return ans;
    }
}
