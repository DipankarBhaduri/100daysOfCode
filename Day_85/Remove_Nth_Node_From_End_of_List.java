package Day_85;

public class Remove_Nth_Node_From_End_of_List {
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

        Node add_last(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return head;
            }

            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
            return head;
        }
    }

    static void print_nodes(Node head) {
        Node curr = head;
        while (curr.next != null) {
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

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        Node head = null;
        LL.add_last(2);
        LL.add_last(3);
        LL.add_last(4);
        LL.add_last(5);
        LL.add_last(6);
        LL.add_last(7);
        head = LL.add_last(8);
        print_nodes(head);
        Node result = removeFromTheEnd(head, 6);
        print_nodes(result);
    }
}
