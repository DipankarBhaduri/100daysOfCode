package Day_54;

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
        int[] ans = sum_of_two_array(arr1, m, arr2, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] sum_of_two_array(int[] arr1, int m, int arr2[], int n) {
        if (m == 0 && n != 0) {
            return arr2;
        }

        if (m != 0 && n == 0) {
            return arr1;
        }

        if (m == 0 && n == 0) {
            return arr2;
        }

        String s1 = "";
        for (int i = 0; i < m; i++) {
            int val = arr1[i];
            String str = Integer.toString(val);
            s1 += str;
        }

        String s2 = "";
        for (int i = 0; i < n; i++) {
            int val = arr2[i];
            String str = Integer.toString(val);
            s2 += str;
        }

        int val1 = Integer.parseInt(s1);
        int val2 = Integer.parseInt(s2);
        int ans = val1 + val2;
        String cur = Integer.toString(ans);
        int length = cur.length();
        int result[] = new int[length];
        int idx = length - 1;

        while (ans > 0) {
            int rem = ans % 10;
            result[idx--] = rem;
            ans = ans / 10;
        }

        return result;
    }
}
