package Day_65;

import java.util.*;

public class Rotate_a_Matrix_by_90_Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
        int[][] ans = perfrpm_Rotate_a_Matrix_by_90_Degree(arr, m, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] perfrpm_Rotate_a_Matrix_by_90_Degree(int[][] arr, int m, int n) {
        int[][] ans = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = arr[j][i];
            }
        }

        return ans;

    }
}
