package Day_22_oops;

import java.util.*;

public class Minimum_Removals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length_of_arr = sc.nextInt();
        int max_diff = sc.nextInt();
        int[] arr = new int[length_of_arr];
        for (int i = 0; i < length_of_arr; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int minimum_removal_element = calculate_the_minimum_removal(arr, max_diff);
        System.out.print(minimum_removal_element);
    }

    public static int calculate_the_minimum_removal(int[] arr, int max_diff) {
        int start = 0;
        int end = arr.length - 1;

        Arrays.sort(arr);
        while (start < end) {
            if (arr[end] - arr[start] <= max_diff) {
                int ans = start - 0;
                ans += ((arr.length - 1) - end);
                return ans;
            } else if (arr[end] - arr[start] > max_diff) {
                start++;
            }
        }

        return -1;
    }
}
