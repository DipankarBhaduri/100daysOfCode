package Day_16;

import java.util.*;

public class AS_Loops_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        sum_of_digit(n);

    }

    public static void sum_of_digit(int n) {
        int rem = 0;
        int count = 0;

        while (n > 0) {
            rem = n % 10;
            count++;
            n = n / 10;
        }

        System.out.print(count);
    }
}
