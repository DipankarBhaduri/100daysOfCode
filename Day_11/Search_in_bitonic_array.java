package Day_11;

import java.util.*;

public class Search_in_bitonic_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        sc.close();
        int ans = search_in_bitonic(arr, target);
        System.out.print(ans);

    }

    public static int search_in_bitonic(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
