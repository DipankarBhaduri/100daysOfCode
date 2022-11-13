package Day_28;

import java.util.*;

public class Merge_k_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = n * n;
        int[] arr = new int[l];

        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        perfrom_sorting_operation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void perfrom_sorting_operation(int[] arr) {
        Arrays.sort(arr);
    }
}
