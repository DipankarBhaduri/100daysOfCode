package Day_85;

public class Middle_of_the_Linked_List {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        void add_last(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
            return;
        }
    }

    static void print_nodes(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    static Node removeFromTheEnd(Node head, int n) {
        Node start = new Node(0);
        start.next = head;
        Node slow = start;
        Node fast = start;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }

    static Node middleNode(Node head) {
        int count = 1;
        Node curr = head;
        while (head != null) {

            if (count % 2 == 0) {
                curr = curr.next;
            }
            head = head.next;
            count++;
        }
        return curr;
    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.add_last(1);
        LL.add_last(2);
        LL.add_last(3);
        LL.add_last(4);
        LL.add_last(5);
        LL.add_last(6);
        LL.add_last(7);
        LL.add_last(8);
        LL.add_last(9);
        LL.add_last(10);

        print_nodes(LL.head);
        Node result = middleNode(LL.head);
        print_nodes(result);
    }
}