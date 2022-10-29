package Day_13;

import java.util.*;

public class Sum_of_Array_elements_using_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = sum_of_array_element(arr);
        System.out.print(ans);
    }

    public static int sum_of_array_element(int[] arr) {
        int sum = 0;

        for (int x : arr) {
            sum += x;
        }
        return sum;
    }
}
