package Day_80_Queue;

import java.util.*;

public class Stack_Implementation_using_two_queue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // isEmpty() function:-->>
        boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push () :-->>
        void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // peek() :-->>
        int peek() {
            if (isEmpty()) {
                return -1;
            }

            int top = -1;
            // case-1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }

        // pop() :-->>
        void pop() {
            if (isEmpty()) {
                return;
            }

            int top = -1;
            // case-1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
