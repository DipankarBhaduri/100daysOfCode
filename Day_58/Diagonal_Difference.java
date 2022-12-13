package Day_58;

import java.util.*;

public class Diagonal_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int[][] arr = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
        find_out_the_diagonal_difference(arr);
    }

    static void find_out_the_diagonal_difference(int[][] arr) {
        int sum_of_left_diagonal = 0;
        int sum_of_right_diagonal = 0;
        int m = arr.length;

        for (int i = 0; i < m; i++) {
            sum_of_left_diagonal += arr[i][i];
        }

        for (int j = 0; j < m; j++) {
            int k = m - 1 - j;
            sum_of_right_diagonal += arr[j][k];
        }

        if (sum_of_left_diagonal == sum_of_right_diagonal) {
            System.out.print(0);
        } else if (sum_of_left_diagonal > sum_of_right_diagonal) {
            System.out.print(sum_of_left_diagonal - sum_of_right_diagonal);
        } else {
            System.out.print(sum_of_right_diagonal - sum_of_left_diagonal);
        }

    }
}
