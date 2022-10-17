//You are given two non-negative integers. Can you calculate their LCM?

package Day_1;

import java.util.*;

public class LCM_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print(LCM_of_two_interger(num1, num2));
    }

    public static int LCM_of_two_interger(int num1, int num2) {
        int gcm = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcm = i;
            }
        }

        int lcm = (num1 * num2) / gcm;
        return lcm;
    }
}
