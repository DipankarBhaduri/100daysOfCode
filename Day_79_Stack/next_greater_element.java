package Day_79_Stack;

import java.util.*;

public class next_greater_element {
    static int[] find_out_next_greater(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        ans[n - 1] = -1;
        s.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while (s.size() > 0 && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = find_out_next_greater(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
