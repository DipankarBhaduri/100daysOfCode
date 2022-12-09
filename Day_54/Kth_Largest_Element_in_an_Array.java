package Day_54;

import java.util.*;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        sc.close();
        int ans = find_out_the_kth_largest_element(arr, k);
        System.out.print(ans);

    }

    static int find_out_the_kth_largest_element(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n - k];
    }
}
