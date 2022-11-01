package Day_16;

import java.util.*;

public class Flip_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = maxOnes(arr, n);
        System.out.print(ans);

    }

    public static int maxOnes(int a[], int n) {
        int current = 0;
        int ones = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                ones++;
            }

            int val = 0;
            val = (a[i] == 1) ? -1 : 1;

            current = Math.max(current + val, val);
            max = Math.max(max, current);

        }

        return max + ones;
    }
}
