package Day_17;

import java.util.*;

public class Element_Arrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        element_arangement(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void element_arangement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[idx++] = arr[i];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                result[idx++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}
