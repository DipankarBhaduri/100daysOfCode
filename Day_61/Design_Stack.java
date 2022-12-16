package Day_61;

import java.util.*;

public class Design_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            int num1 = sc.nextInt();
            if (num1 == 1) {
                int num = sc.nextInt();
                stk.push(num);
            } else if (num1 == 2) {
                if (stk.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stk.peek());
                }
            } else if (num1 == 3) {
                if (stk.isEmpty()) {

                } else {
                    stk.pop();
                }
            } else if (num1 == 4) {
                while (!stk.isEmpty()) {
                    System.out.print(stk.peek() + " ");
                    stk.pop();
                }
            }
            sc.close();
        }
    }
}
