package Day_25;

import java.util.*;

public class Minimum_Element_in_Rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = Minimum_Element_in_Rotated_array(arr);
        System.out.print(ans);
    }

    public static int Minimum_Element_in_Rotated_array(int[] arr) {
        int n = arr.length;
        int count = 0;
        boolean b = false;

        while (!b) {

            int value = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = value;
            b = check_sorted_or_not(arr);
            count++;
        }
        int count2 = n - count;
        int min = Math.min(count, count2);
        return min;
    }

    public static boolean check_sorted_or_not(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (!(arr[i] < arr[i + 1])) {
                return false;
            }
        }
        return true;
    }
}
