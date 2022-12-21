package Day_66;

import java.util.*;

public class Rearrange_Even_Odd_Nodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                ans[idx++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                ans[idx++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
