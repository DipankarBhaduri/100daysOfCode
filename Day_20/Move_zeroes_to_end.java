package Day_20;

import java.util.*;

public class Move_zeroes_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int idx = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > 0) {
                arr[idx++] = temp;
            }
        }

        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
