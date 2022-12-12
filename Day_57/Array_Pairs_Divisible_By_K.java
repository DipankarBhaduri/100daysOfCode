package Day_57;

import java.util.*;

public class Array_Pairs_Divisible_By_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        boolean b = check_array_pair_divisible_by_k_or_not(arr, k);
        System.out.print(b);
    }

    static boolean check_array_pair_divisible_by_k_or_not(int[] arr, int k) {
        int pairCount = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    pairCount++;
                }
            }
        }

        if (pairCount == (n / 2)) {
            return true;
        } else {
            return false;
        }
    }
}
