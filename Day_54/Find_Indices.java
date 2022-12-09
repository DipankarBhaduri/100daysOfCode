package Day_54;

import java.util.*;

public class Find_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        find_the_all_index_of_x(arr, x);
    }

    static void find_the_all_index_of_x(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.print(i + " ");
            }
        }
    }
}
