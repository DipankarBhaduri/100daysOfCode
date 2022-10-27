package Day_11;

import java.util.*;

public class Array_220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        System.out.print(array_220(arr));
    }

    public static boolean array_220(int[] arr) {
        if (arr.length == 1) {
            return false;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] * 10 <= arr[i]) {
                return true;
            }
        }

        return false;
    }
}
