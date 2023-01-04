package Day_80_Queue;

import java.util.*;

public class Queue_using_two_stack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // add () :-->>
        void add(int data) {
            if (s1.isEmpty()) {
                s1.push(data);
                return;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // peek() :-->>
        int peek() {
            if (s1.isEmpty()) {
                return -1;
            } else {
                return s1.peek();
            }
        }

        // remove () :-->>
        void remove() {
            if (s1.isEmpty()) {
                return;
            } else {
                s1.pop();
            }
        }

        // isEmpty() :-->>
        boolean isEmpty() {
            return s1.size() == 0;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
