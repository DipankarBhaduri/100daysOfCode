package Day_19;

import java.util.*;

public class Last_occurrence_in_unsorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int idx = find_the_last_index(arr, target);
        System.out.print(idx);

    }

    public static int find_the_last_index(int[] arr, int target) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
