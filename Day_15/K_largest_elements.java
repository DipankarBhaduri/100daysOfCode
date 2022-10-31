package Day_15;

import java.util.*;

public class K_largest_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        k_largest(arr, k);
    }

    public static void k_largest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = n - 1; i >= (n - k); i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
