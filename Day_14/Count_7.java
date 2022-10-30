package Day_14;

import java.util.*;

public class Count_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = count_7_operation(n);
        System.out.print(result);
    }

    public static int count_7_operation(int n) {
        int count = 0;
        int rem = 0;

        while (n > 0) {
            rem = n % 10;
            if (rem == 7) {
                count++;
            }
            n = n / 10;
        }

        return count;
    }
}
