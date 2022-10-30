package Day_14;

import java.util.*;

public class Merge_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        print_result(arr1, arr2);

    }

    public static void print_result(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];
        int idx = 0;

        for (int i = 0; i < n1; i++) {
            arr3[idx++] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            arr3[idx++] = arr2[i];
        }

        Arrays.sort(arr3);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}
