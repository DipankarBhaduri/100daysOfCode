package Day_33;

import java.util.*;

public class Matrix_diagonal_sum {
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
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < i + 1; j++) {

                sum = sum + mat[i][j];

            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = mat.length - i - 1; j > mat.length - i - 2; j--) {

                sum = sum + mat[i][j];

            }
        }

        if (mat.length % 2 != 0) {
            sum = sum - mat[mat.length / 2][mat.length / 2];
        }

        return sum;
    }
}
