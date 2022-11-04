package Day_19;

import java.util.*;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
            System.out.print(arr2[i] + " ");
        }
    }
}
