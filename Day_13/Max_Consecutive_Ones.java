package Day_13;

import java.util.*;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int result = max_consecutive(arr);
        System.out.print(result);
    }

    public static int max_consecutive(int[] arr) {
        int n = arr.length;

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            if (val == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
