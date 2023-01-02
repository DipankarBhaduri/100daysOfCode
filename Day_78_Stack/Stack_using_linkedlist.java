package Day_78_Stack;

public class Stack_using_linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        // isEmpty() function :-->>
        public boolean isEmpty() {
            return (head == null);
        }

        // push() function :-->>
        public void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // pop() function :-->>
        public void pop() {
            if (head == null) {
                return;
            }

            head = head.next;
        }

        // peek() function :-->>
        public int peek() {
            if (head == null) {
                return -1;
            }

            int top = head.data;
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
