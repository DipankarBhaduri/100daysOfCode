package Day_80_Queue;

public class Queue_implement_using_array {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty() function :-->>
        public boolean isEmpty() {
            return rear == -1;
        }

        // add() function :-->>
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // peek() function :-->>
        public int peek() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

        // remove () function :-->>
        public int remove() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
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
