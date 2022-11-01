package Day_16;

import java.util.*;

public class Maximum_Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int max_distance = calculate_maximum_distance(arr);
        System.out.print(max_distance);
    }

    public static int calculate_maximum_distance(int[] arr) {
        int max = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (curr == arr[j]) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }
}
