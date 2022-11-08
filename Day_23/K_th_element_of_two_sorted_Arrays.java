package Day_23;

import java.util.*;

public class K_th_element_of_two_sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        sc.close();
        int ans = after_merged_kth_position(arr1, arr2, n1, n2, k);
        System.out.print(ans);

    }

    public static int after_merged_kth_position(int[] arr1, int arr2[], int n1, int n2, int k) {
        int ans[] = new int[n1 + n2];
        int idx = 0;
        for (int i = 0; i < n1; i++) {
            ans[idx++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            ans[idx++] = arr2[i];
        }

        Arrays.sort(ans);
        return ans[k - 1];
    }
}
