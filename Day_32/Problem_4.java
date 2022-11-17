package Day_32;

import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][4];
        int evenCount = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] % 2 == 0) {
                    evenCount++;
                }
            }
        }

        sc.close();
        System.out.print(evenCount);
    }
}
