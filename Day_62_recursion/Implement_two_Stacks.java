package Day_62_recursion;

import java.util.*;

public class Implement_two_Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();

        int t = sc.nextInt();
        while (t-- > 0) {

            int num = sc.nextInt();
            if (num == 1) {
                if (!stk1.isEmpty()) {
                    System.out.println(stk1.pop());
                } else {
                    System.out.println(-1);
                }
            } else if (num == 2) {
                int val = sc.nextInt();
                stk1.push(val);
            } else if (num == 3) {
                if (!stk2.isEmpty()) {
                    System.out.println(stk2.pop());
                } else {
                    System.out.println(-1);
                }
            } else {
                int value = sc.nextInt();
                stk2.push(value);
            }
        }
    }
}
