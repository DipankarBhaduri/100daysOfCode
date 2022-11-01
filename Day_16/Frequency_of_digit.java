package Day_16;

import java.util.*;

public class Frequency_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        int d = sc.nextInt();

        sc.close();
        int ans = frequency_of_digits(L, d);
        System.out.print(ans);

    }

    public static int frequency_of_digits(long l, int d) {
        int count = 0;

        while (l > 0) {
            long rem = l % 10;
            if (rem == d) {
                count++;
            }
            l = l / 10;
        }

        return count;
    }
}
