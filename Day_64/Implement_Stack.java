package Day_64;

import java.util.*;

public class Implement_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<Integer> stk = new Stack<>();

        while (t-- > 0) {
            int num = sc.nextInt();
            if (num == 1) {
                int val = sc.nextInt();
                stk.push(val);
            } else if (num == 2) {
                if (!stk.isEmpty()) {
                    System.out.print(stk.pop() + " ");
                } else {
                    System.out.print(-1 + " ");
                }
            }
        }
    }
}
