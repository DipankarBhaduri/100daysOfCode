package Day_36;

import java.util.*;

public class Rishabh_loves_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = continuous_zeros(arr);
        System.out.print(ans);
    }

    public static int continuous_zeros(int[] arr) {
        int zeroCount = 0;
        int maxZero = 0;

        for (int val : arr) {
            if (val == 0) {
                zeroCount++;
                maxZero = Math.max(zeroCount, maxZero);
            } else {
                zeroCount = 0;
            }
        }

        return maxZero;
    }
}
