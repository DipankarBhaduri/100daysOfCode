package Day_61;

import java.util.*;

public class Print_Matrix_Column_Wise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int row = sc.nextInt();
            int column = sc.nextInt();
            int[][] mat = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            print_matrix_column_wise(mat, row, column);
        }
        sc.close();
    }

    public static void print_matrix_column_wise(int[][] mat, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat[j][i] + " ");
            }
        }
    }
}
