package Day_10;

import java.util.*;

public class Max_Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = findMaxDistance(arr);
        System.out.println(ans);
    }

    public static int findMaxDistance(int[] arr) {
        int maxDis = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    maxDis = Math.max(maxDis, (j - i));
                }
            }
        }
        return maxDis;
    }
}

/*
 * j-i such that A[i]<=A[j] and i<=j.
 * Input :->>
 * 4
 * 3 5 4 2
 * Output : 2
 * 
 * 8 -->>>
 * 8 7 3 4 2 5 1 6 // 34, 8, 10, 3, 2, 80, 30, 33, 1
 */