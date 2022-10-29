package Day_13;

import java.util.*;

public class Sum_Of_Even_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sum_even_digit(n);
        sc.close();

        System.out.print(ans);
    }

    public static int sum_even_digit(int n) {
        int sum = 0;
        int count = 0;
        int rem = 0;

        while (n > 0) {
            count++;
            rem = n % 10;

            if (count % 2 == 0) {
                sum += rem;
            }
            n = n / 10;
        }
        return sum;
    }
}
