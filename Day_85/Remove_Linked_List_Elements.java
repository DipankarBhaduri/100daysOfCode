package Day_85;

public class Remove_Linked_List_Elements {
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

    static void print_all_nodes(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println();
    }

    static Node remove_the_linked_list_element(Node head, int value) {
        Node fakeHead = new Node(0);
        fakeHead.next = head;
        Node curr = head;
        Node fast = fakeHead;

        while (curr != null) {
            if (curr.data == value) {
                fast.next = curr.next;
            } else {
                fast = fast.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;
    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.add_last(1);
        LL.add_last(2);
        LL.add_last(3);
        LL.add_last(4);
        LL.add_last(1);
        LL.add_last(2);
        LL.add_last(3);

        Node result = remove_the_linked_list_element(LL.head, 3);
        print_all_nodes(result);
    }
}
