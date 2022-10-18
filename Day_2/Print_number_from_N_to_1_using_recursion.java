package Day_2;

import java.util.*;

public class Print_number_from_N_to_1_using_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
    }

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNumber(n - 1);
    }
}
