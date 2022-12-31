package Day_76;

import java.util.*;

public class Find_K_Closest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        find_k_closest(arr, k, x);
        sc.close();
    }

    static void find_k_closest(int[] arr, int k, int x) {
        int Nearest = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int value = x - arr[i];
            if (value < Nearest) {
                Nearest = value;
                index = i;
            }
        }

        System.out.print(index + " " + Nearest);
    }
}