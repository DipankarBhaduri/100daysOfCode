package Day_78_Stack;

import java.util.*;

public class push_at_the_bottom_of_the_stack {
    static void push_at_buttom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        push_at_buttom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        push_at_buttom(s, 0);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        // System.out.print(s.size());
    }
}
