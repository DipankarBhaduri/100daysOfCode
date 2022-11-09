package Day_24;

import java.util.*;

public class Print_Number_Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        print_number_2_pattern(n);
    }

    public static void print_number_2_pattern(int n) {
        for (int i = 0; i < n; i++) {
            int print = i + 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(print--);
            }
            System.out.println();
        }
    }
}
