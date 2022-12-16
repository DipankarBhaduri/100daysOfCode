package Day_61;

import java.util.*;

public class Sum_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        int[] ans = perfrom_sum_of_two_array(arr1, m, arr2, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] perfrom_sum_of_two_array(int[] arr1, int m, int[] arr2, int n) {
        Stack<Integer> stk = new Stack<>();
        int rem = 0;
        int L1 = m - 1;
        int L2 = n - 1;

        while (L1 != -1 && L2 != -1) {
            int value = arr1[L1] + arr2[L2] + rem;
            if (value < 10) {
                stk.push(value);
                rem = 0;
            } else {
                rem = 1;
                stk.push(value % 10);
            }

            L1--;
            L2--;
        }

        while (L1 != -1) {
            int value = arr1[L1] + rem;
            if (value < 10) {
                stk.push(value);
                rem = 0;
            } else {
                rem = 1;
                stk.push(value % 10);
            }

            L1--;
        }

        while (L2 != -1) {
            int value = arr2[L2] + rem;
            if (value < 10) {
                stk.push(value);
                rem = 0;
            } else {
                rem = 1;
                stk.push(value % 10);
            }

            L2--;
        }

        if (rem == 1) {
            stk.push(rem);
            rem = 0;
        }

        int[] ans = new int[stk.size()];
        int idx = 0;

        while (!stk.isEmpty()) {
            ans[idx++] = stk.pop();
        }

        return ans;
    }
}
