package Day_19;

import java.util.*;

public class zero_two_one_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp == 1) {
                arr[idx++] = 3;
            } else {
                arr[idx++] = temp;
            }
        }
        sc.close();

        perfrom_zero_two_one_shorting(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void perfrom_zero_two_one_shorting(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 3) {
                arr[i] = 1;
            }
        }
    }
}
