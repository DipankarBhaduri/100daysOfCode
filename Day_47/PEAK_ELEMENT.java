package Day_47;

import java.util.*;

public class PEAK_ELEMENT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = search_peak_element(arr);
        System.out.print(ans);

    }

    static int search_peak_element(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        if (arr[0] > arr[1]) {
            return 0;
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }

        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        return -1;
    }
}
