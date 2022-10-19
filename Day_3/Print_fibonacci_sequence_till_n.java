package Day_3;

import java.util.Scanner;

public class Print_fibonacci_sequence_till_n {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 10;
        System.out.print(a + " " + b + " ");

        printFibo(a, b, n - 2);
    }

    public static void printFibo(int a, int b, int n) {

        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        printFibo(b, c, n - 1);
    }
}
