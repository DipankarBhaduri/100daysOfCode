package Day_80_Queue;

public class Circular_queue_using_array {
    static class Queue {
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        Queue(int data) {
            arr = new int[data];
            size = data;
            front = rear = -1;
        }

        // isFull() function :-->>
        boolean isFull() {
            return (rear + 1) % size == front;
        }

        // isEmpty() function :-->>
        boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // add :-->>
        void add(int data) {
            if (isFull()) {
                System.out.print("Queue is full");
                return;
            }
            if (front == -1) {
                front++;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove() :-->>
        void remove() {
            if (isEmpty()) {
                return;
            }
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
        }

        // peek() :-->>
        int peek() {
            if (isEmpty()) {
                return -1;
            } else {
                return arr[front];
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        // q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
