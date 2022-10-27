package Day_11;

import java.util.*;

public class Matrix_Column_Major_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] arr = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
        major_order_print(arr, n1, n2);
    }

    public static void major_order_print(int[][] arr, int n1, int n2) {
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr[j][i] + " ");
            }
        }
    }
}
