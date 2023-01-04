package Day_80_Queue;

public class Queue_implement_using_linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // isEmpty ()
        boolean isEmpty() {
            return head == null && tail == null;
        }

        // add () :-->>
        void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // peek() :-->>
        int peek() {
            if (isEmpty()) {
                return -1;
            }

            int result = head.data;
            return result;
        }

        // Remove() :-->>
        void remove() {
            if (isEmpty()) {
                return;
            }
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
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
            ;
        }
    }
}
