package Day_56;

import java.util.*;

public class Previous_Greater_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int[] ans = print_previous_greater_element(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] print_previous_greater_element(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = -1;

        if (n == 1) {
            return ans;
        }

        for (int i = 1; i < n; i++) {
            boolean flag = true;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    ans[i] = arr[j];
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                ans[i] = -1;
            }
        }
        return ans;
    }
}
