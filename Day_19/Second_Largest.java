package Day_19;

import java.util.*;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = second_largest_element(arr);
        System.out.print(ans);
    }

    public static int second_largest_element(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n == 1) {
            return -1;
        }

        for (int i = n - 1; i >= 1; i--) {
            if (arr[i] > arr[i - 1]) {
                return arr[i - 1];
            }
        }

        return -1;
    }
}
