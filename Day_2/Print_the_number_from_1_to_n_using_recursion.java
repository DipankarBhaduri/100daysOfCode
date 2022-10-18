package Day_2;

import java.util.*;

public class Print_the_number_from_1_to_n_using_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(1, n);
    }

    public static void printNumber(int start, int end) {
        if (start > end) {
            return;
        }

        System.out.print(start + " ");
        printNumber(start + 1, end);
    }
}
