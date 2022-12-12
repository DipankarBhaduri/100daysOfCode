package Day_57;

import java.util.*;

public class Move_zeroes_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        move_zero_to_the_end(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void move_zero_to_the_end(int[] arr) {
        int[] ans = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < ans.length; i++) {
            int val = arr[i];
            if (val != 0) {
                ans[idx++] = val;
            }
        }

        while (idx < ans.length) {
            ans[idx++] = 0;
        }

        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
    }
}
