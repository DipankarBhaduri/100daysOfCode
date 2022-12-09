package Day_54;

import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = perfrom_the_binary_search(arr, key);
        System.out.print(ans);

    }

    static int perfrom_the_binary_search(int[] arr, int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + end / 2;

            if (arr[mid] == key) {
                ans = mid;
                return ans;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
