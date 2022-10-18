// Print the sum of first n natural numbers 
package Day_2;

import java.util.*;

public class Recursion_N_number_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        N_number_sum(1, n, 0);

    }

    public static void N_number_sum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.print(sum);
            return;
        }

        sum += i;
        N_number_sum(i + 1, n, sum);
    }
}
