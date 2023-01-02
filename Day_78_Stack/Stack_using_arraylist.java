package Day_78_Stack;

import java.util.*;

public class Stack_using_arraylist {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty() function :-->>
        public boolean isEmpty() {
            return (list.size() == 0);
        }

        // Push function :-->>
        public void push(int data) {
            list.add(data);
        }

        // Pop functions :-->>
        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek() function :-->>
        int peek() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
