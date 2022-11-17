package Day_32;

import java.util.*;

public class Smallest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();

        sc.close();
        int ans = find_out_the_smallest_number(n, sum);
        System.out.print(ans);
    }

    public static int find_out_the_smallest_number(int n, int sum) {
        if (n == 1 && sum < 10) {
            return sum;
        } else {

            for (int i = 10; true; i++) {
                boolean b = helper_of_smallest_number(n, i, sum);
                if (b) {
                    return i;
                }
            }
        }
    }

    public static boolean helper_of_smallest_number(int n, int num, int sum) {
        int add = 0;
        int rem = 0;
        int count = 0;

        while (num > 0) {
            rem = num % 10;
            count++;
            add += rem;
            num = num / 10;
        }

        if (add == sum && n == count) {
            return true;
        } else {
            return false;
        }
    }
}
