package Day_60;

import java.util.*;

public class Implement_stack_using_queues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                int val = sc.nextInt();
                push_element(val);
            } else {
                int ans = pop_element();
                System.out.print(ans + " ");
            }
        }
        sc.close();
    }

    static Stack<Integer> stk = new Stack<>();

    static void push_element(int n) {
        stk.push(n);
    }

    static int pop_element() {
        if (!stk.isEmpty()) {
            return stk.pop();
        }
        return -1;
    }
}
