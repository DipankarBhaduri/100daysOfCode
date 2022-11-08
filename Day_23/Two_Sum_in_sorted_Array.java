package Day_23;

import java.util.*;

public class Two_Sum_in_sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int[] result = find_the_two_sum_in_sorted_array(arr, target);
        System.out.print(result[0] + " " + result[1]);
    }

    public static int[] find_the_two_sum_in_sorted_array(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int[] idx = new int[2];

        while (start <= end) {
            if ((arr[start] + arr[end]) == target) {
                idx[0] = start + 1;
                idx[1] = end + 1;
                break;
            } else if ((arr[start] + arr[end]) > target) {
                end--;
            } else {
                start++;
            }
        }
        return idx;
    }
}
