package Day_83;

public class Add_Two_Numbers {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head = null;

        Node add_last(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return head;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            return head;
        }
    }

    static void print_element(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // @ add two number ( LEETCODE ) :-->>
    static Node add_two_number(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node result = dummy;
        int carry = 0;
        while (head1 != null || head2 != null || carry == 1) {
            int sum = 0;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }

            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            sum += carry;
            carry = sum / 10;

            Node newNode = new Node(sum % 10);
            dummy.next = newNode;
            dummy = dummy.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        LinkedList LL1 = new LinkedList();
        Node root1 = null;
        root1 = LL1.add_last(9);
        root1 = LL1.add_last(9);
        root1 = LL1.add_last(9);
        root1 = LL1.add_last(9);
        root1 = LL1.add_last(9);
        root1 = LL1.add_last(9);
        root1 = LL1.add_last(9);
        print_element(root1);

        LinkedList LL2 = new LinkedList();
        Node root2 = null;
        root2 = LL2.add_last(9);
        root2 = LL2.add_last(9);
        root2 = LL2.add_last(9);
        root2 = LL2.add_last(9);

        print_element(root2);

        Node result = add_two_number(root1, root2);
        System.out.print("After adding the two number : ");
        print_element(result);
    }
}
