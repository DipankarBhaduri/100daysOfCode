package Day_15;

import java.util.*;

public class Magic_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int ans = check_magic_matrix(arr);
        System.out.print(ans);

    }

    public static int check_magic_matrix(int[][] arr) {
        int row1 = arr[0][0] + arr[0][1] + arr[0][2];
        int row2 = arr[1][0] + arr[1][1] + arr[1][2];
        int row3 = arr[2][0] + arr[2][1] + arr[2][2];

        int col1 = arr[0][0] + arr[1][0] + arr[2][0];
        int col2 = arr[0][1] + arr[1][1] + arr[2][1];
        int col3 = arr[0][2] + arr[1][2] + arr[2][2];

        if (row1 == row2 && row2 == row3 && col1 == col2 && col2 == col3 && row1 == col1) {
            return row1;
        }

        return 0;
    }
}

// Sample Input 1

// 2 7 6 9 5 1 4 3 8
// Sample Output 1

// 15
// Explanation

// Given 2D-array
// 2 7 6
// 9 5 1
// 4 3 8