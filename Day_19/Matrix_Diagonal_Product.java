package Day_19;

import java.util.*;

public class Matrix_Diagonal_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(diagonal_product(arr, n));
    }

    public static long diagonal_product(int[][] arr, int n) {
        long ans = 1;

        if (n == 2) {
            ans = arr[0][0] * arr[0][1] * arr[1][1] * arr[1][0];
        }

        if (n == 3) {
            ans = arr[0][0] * arr[0][2] * arr[1][1] * arr[2][2] * arr[2][0];
        }

        if (n == 4) {
            ans = arr[0][0] * arr[0][3] * arr[1][1] * arr[1][2] * arr[2][1] * arr[2][2] * arr[0][3] * arr[3][3];
        }

        if (n == 5) {
            ans = arr[0][0] * arr[0][4] * arr[1][1] * arr[1][3] * arr[2][2] * arr[3][1] * arr[3][3] * arr[4][1]
                    * arr[4][4];
        }

        return ans;
    }
}
