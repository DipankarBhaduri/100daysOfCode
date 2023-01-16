package Day_92;

import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        int n = 5;
        int[] ans = nextLargerElement(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] nextLargerElement(int[] arr, int n) {
        int ans[] = new int[n];
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
        return ans;
    }
}
