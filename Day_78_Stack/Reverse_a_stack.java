package Day_78_Stack;

import java.util.*;

public class Reverse_a_stack {

    static void reverse_stack(Stack<Integer> stk) {
        if (stk.isEmpty()) {
            return;
        }
        int top = stk.pop();
        reverse_stack(stk);
        push_at_bottom(stk, top);
    }

    static void push_at_bottom(Stack<Integer> stk, int data) {
        if (stk.isEmpty()) {
            stk.push(data);
            return;
        }
        int top = stk.pop();
        push_at_bottom(stk, data);
        stk.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        while (!stk.isEmpty()) {
            System.out.println(stk.pop());
        }

        System.out.println("-----------");

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        reverse_stack(stk);

        while (!stk.isEmpty()) {
            System.out.println(stk.pop());
        }
    }
}
