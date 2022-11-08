package Day_23;

import java.util.*;

public class Search_for_a_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        sc.close();
        int first_occurrence = search_first_position(arr, target);
        int last_occurrence = last_first_position(arr, target);
        System.out.print(first_occurrence + " " + last_occurrence);

    }

    public static int search_first_position(int[] arr, int target) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return ans;
    }

    public static int last_first_position(int[] arr, int target) {
        int ans = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return ans;
    }
}
