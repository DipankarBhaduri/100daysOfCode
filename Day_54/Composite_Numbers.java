package Day_54;

import java.util.*;

public class Composite_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        print_composite_numbers(arr);
    }

    static void print_composite_numbers(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (helper_of_composite_number(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static boolean helper_of_composite_number(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count > 2) {
            return false;
        } else {
            return true;
        }
    }
}
