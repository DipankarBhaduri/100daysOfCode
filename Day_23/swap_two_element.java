package Day_23;

import java.util.*;

public class swap_two_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = sc.nextInt();
        int second = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int[] result = perfrom_swapping_of_two_element(arr, first, second);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static int[] perfrom_swapping_of_two_element(int[] arr, int first, int second) {
        int st = arr[first - 1];
        int nd = arr[second - 1];
        arr[first - 1] = nd;
        arr[second - 1] = st;

        return arr;
    }
}
