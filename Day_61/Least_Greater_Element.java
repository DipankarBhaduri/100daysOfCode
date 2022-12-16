package Day_61;

import java.util.*;

public class Least_Greater_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        print_least_greater_element(arr);
    }

    static void print_least_greater_element(int[] arr) {
        int[] ans = new int[arr.length];
        int n = arr.length;
        ans[n - 1] = -1;

        Stack<Integer> stk = new Stack<>();
        stk.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while (stk.size() > 0 && arr[i] >= stk.peek()) {
                stk.pop();
            }

            if (stk.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = stk.peek();
            }

            stk.push(arr[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
