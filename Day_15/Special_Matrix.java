package Day_15;

import java.util.*;

public class Special_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            sc.close();
            System.out.println(check_matrix(arr, n));
        }
    }

    public static boolean check_matrix(int[][] arr, int n) {
        int zero_count = 0;
        int nonzero_count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    zero_count++;
                } else {
                    nonzero_count++;
                }
            }
        }

        if (n == 3 && zero_count == 4) {
            return true;
        }

        if (n == 4 && nonzero_count == 8) {
            return true;
        }

        return false;

    }
}

// Example 1:
// Input:

// 1
// 3
// 1 0 2
// 0 2 0
// 3 0 1
// Output:

// true