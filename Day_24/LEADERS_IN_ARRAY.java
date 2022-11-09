package Day_24;

import java.util.*;

public class LEADERS_IN_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        print_leaders_array(arr);
    }

    public static void print_leaders_array(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print(arr[n - 1]);
    }
}
