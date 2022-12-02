package Day_47;

import java.util.*;

public class Pair_Sum_in_Sorted_Array {
    public static void pairSum(int n, int k, int a[]) {
        int start = 0;
        int end = n - 1;

        boolean flag = true;
        while (start < end) {
            if (a[start] + a[end] == k) {
                System.out.print("Yes");
                flag = false;
                return;
            } else if (a[start] + a[end] > k) {
                end--;
            } else {
                start++;
            }
        }

        if (flag == true) {
            System.out.print("No");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        pairSum(n, k, a);
        input.close();
    }
}