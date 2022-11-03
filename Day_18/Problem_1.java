package Day_18;

import java.util.*;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
        int num = sc.nextInt();

        sc.close();
        find_the_index(arr, num);

    }

    public static void find_the_index(int[][] arr, int num) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == num) {
                    System.out.print(i + " " + j);
                    break;
                }
            }
        }
    }
}
