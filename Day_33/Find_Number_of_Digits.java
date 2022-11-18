package Day_33;

import java.util.*;

public class Find_Number_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        sc.close();
        while (n > 0) {
            int rem = n % 10;
            count++;
            n = n / 10;

            if (rem % 2 == 0) {
            }
        }

        System.out.print(count);

    }
}
