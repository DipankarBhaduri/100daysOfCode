package Day_57;

import java.util.*;

public class Kth_Smallest_Element_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        sc.close();
        int k = sc.nextInt();
        int ans = kth_smallest_element(mat, k);
        System.out.print(ans);
    }

    static int kth_smallest_element(int[][] mat, int k) {
        int n = mat.length * mat.length;
        int[] ans = new int[n];
        int idx = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int temp = mat[i][j];
                ans[idx++] = temp;
            }
        }

        Arrays.sort(ans);
        return ans[k - 1];
    }
}
