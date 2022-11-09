package Day_24;

import java.util.*;

public class Rotate_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        sc.close();
        rotate_array(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate_array(int[] arr, int k) {
        int n = arr.length;
        int[] rotate = new int[n];
        if (k > n) {
            k = k % n;
        }
        int idx = 0;
        for (int i = n - k; i < n; i++) {
            rotate[idx++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            rotate[idx++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = rotate[i];
        }
    }
}
