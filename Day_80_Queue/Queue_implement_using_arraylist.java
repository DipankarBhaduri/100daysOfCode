package Day_80_Queue;

import java.util.*;

public class Queue_implement_using_arraylist {
    static class Queue {
        ArrayList<Integer> arr = new ArrayList<>();

        // isEmpty() function :-->>
        public boolean isEmpty() {
            return arr.size() == 0;
        }

        // add() function :-->>
        public void add(int data) {
            arr.add(data);
        }

        // peek() function :-->>
        public int peek() {
            if (arr.size() == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr.get(0);
        }

        // remove () function :-->>
        public int remove() {
            if (arr.size() == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr.get(0);
            arr.remove(0);
            return front;
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
