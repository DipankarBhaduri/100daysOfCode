package Day_65;

import java.util.*;

public class Maximum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            int num = sc.nextInt();
            if (num == 1) {
                int temp = sc.nextInt();
                stk.add(temp);
            } else if (num == 2) {
                if (stk.isEmpty()) {
                } else {
                    stk.pop();
                }
            } else if (num == 3) {
                int ans = find_out_the_maxElement_from_stack(stk);
                System.out.println(ans);
            }
        }
        sc.close();
    }

    static int find_out_the_maxElement_from_stack(Stack<Integer> stk) {
        int maxElement = Integer.MIN_VALUE;
        if (stk.isEmpty()) {
            return 0;
        } else {
            Stack<Integer> rev = new Stack<>();

            while (!stk.isEmpty()) {
                int temp = stk.pop();
                if (temp > maxElement) {
                    maxElement = temp;
                }
                rev.add(temp);
            }

            while (!rev.isEmpty()) {
                stk.add(rev.pop());
            }

            return maxElement;
        }
    }
}
