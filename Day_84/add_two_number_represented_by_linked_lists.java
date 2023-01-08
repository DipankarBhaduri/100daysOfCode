package Day_84;

public class add_two_number_represented_by_linked_lists {
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

            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = newNode;
            return head;
        }
    }

    static void print_info(Node head) {
        while (head != null) {
            System.out.print(head.data + " -->> ");
            head = head.next;
        }
        System.out.println();
    }

    // @ GFG problem -->> Add two numbers represented by linked lists
    static Node add_two_number(Node head1, Node head2) {
        Node first = helper(head1);
        Node second = helper(head2);

        Node curr = new Node(0);
        Node result = curr;
        int carry = 0;

        while (first != null || second != null || carry == 1) {
            int sum = 0;

            if (first != null) {
                sum += first.data;
                first = first.next;
            }

            if (second != null) {
                sum += second.data;
                second = second.next;
            }

            sum += carry;
            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            curr.next = newNode;
            curr = curr.next;
        }

        Node resultantNode = helper(result.next);
        return resultantNode;

    }

    // Helper function of add teo number :-->
    static Node helper(Node head) {
        Node pre = null;
        while (head != null) {
            Node next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        // @ for first head :-->>
        LinkedList LL = new LinkedList();
        Node first = null;
        first = LL.add_last(3);
        first = LL.add_last(4);
        first = LL.add_last(5);
        print_info(first);

        // @ for second head :-->>
        LinkedList LL2 = new LinkedList();
        Node second = null;
        second = LL2.add_last(4);
        second = LL2.add_last(5);
        print_info(second);

        Node result = add_two_number(first, second);
        print_info(result);
    }
}
