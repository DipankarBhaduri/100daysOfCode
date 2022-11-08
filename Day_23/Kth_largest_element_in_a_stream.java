package Day_23;

import java.util.*;

public class Kth_largest_element_in_a_stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        print_kth_largest_element(arr, k);
    }

    static void print_kth_largest_element(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            map.put(cur, 1);
            if (map.containsKey(cur - k + 1)) {
                System.out.print((cur - k + 1) + " ");
            } else {
                System.out.print(-1 + " ");
            }
        }
    }
}
