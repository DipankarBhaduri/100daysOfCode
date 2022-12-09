package Day_54;

import java.util.*;

public class Sum_of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        subArray_except_self(arr);
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void subArray_except_self(int[] arr) {
        int n = arr.length;
        long sum = 0;

        for (int val : arr) {
            sum += val;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (sum - arr[i]);
        }
    }
}
