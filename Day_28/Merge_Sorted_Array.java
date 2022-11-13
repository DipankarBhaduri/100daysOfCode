package Day_28;

import java.util.*;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int nums1[] = new int[m];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int nums2[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        sc.close();
        int[] ans = merge(nums1, m, nums2, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int st = 0;
        int nd = 0;
        int ans[] = new int[m + n];

        int idx = 0;
        while (st < m && nd < n) {
            if (nums1[st] < nums2[nd]) {
                ans[idx++] = nums1[st++];
            } else {
                ans[idx++] = nums2[nd++];
            }
        }

        while (st < m) {
            ans[idx++] = nums1[st++];
        }

        while (nd < n) {
            ans[idx++] = nums2[nd++];
        }

        return ans;

    }
}
