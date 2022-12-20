package Day_64;

import java.util.*;

public class Evens_Vs_Odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            } else {
                evenSum += i;
            }
        }
        sc.close();

        System.out.print(evenSum - oddSum);
    }
}
