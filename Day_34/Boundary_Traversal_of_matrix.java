package Day_34;

import java.util.*;

public class Boundary_Traversal_of_matrix {
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
        Boundary_Traversal(arr, m, n);
    }

    public static void Boundary_Traversal(int[][] arr, int m, int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[0][i] + " ");
        }

        for (int i = 0; i < m - 1; i++) {
            System.out.print(arr[i][n - 1] + " ");
        }

        for (int i = n - 1; i > 0; i--) {
            System.out.print(arr[m - 1][i] + " ");
        }

        for (int i = m - 1; i > 0; i--) {
            System.out.print(arr[i][0] + " ");
        }
    }
}

/*
 * 
 * 3 4
 * 5 4 6 3
 * 1 4 3 5
 * 5 1 9 6
 * 
 */