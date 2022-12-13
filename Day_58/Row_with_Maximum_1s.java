package Day_58;

import java.util.*;

public class Row_with_Maximum_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int maxRow = 0;
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    ones++;
                }
            }

            if (ones > max) {
                max = ones;
                maxRow = i;
            }
        }

        sc.close();

        System.out.print(maxRow);

    }
}
