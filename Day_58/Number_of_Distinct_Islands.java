package Day_58;

import java.util.*;

public class Number_of_Distinct_Islands {
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
        int ans = Check_number_of_distint_isLand(arr);
        System.out.print(ans);
    }

    static int Check_number_of_distint_isLand(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int max = 0;

        for (int i = 0; i < m; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    ones++;
                } else {
                    max = Math.max(ones, max);
                    ones = 0;
                }
            }

            max = Math.max(ones, max);
            ones = 0;
        }

        return max;
    }
}
