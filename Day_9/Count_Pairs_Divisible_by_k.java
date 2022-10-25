/*

Input
6 4
2 2 1 7 5 3
Output
5

*/
package Day_9;

import java.util.*;

public class Count_Pairs_Divisible_by_k {
    public static int countpair(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % target == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = countpair(arr, target);
        System.out.print(ans);

    }
}
