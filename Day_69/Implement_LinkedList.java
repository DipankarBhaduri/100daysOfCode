package Day_69;

import java.util.*;

// Node class in my LinkedList :-->
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    static Node head;

    // add first method implementation of the linked list :-->
    public Node add_first(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        } else {
            newNode.next = head;
            head = newNode;
            return newNode;
        }
    }

    // add last method implementation of the linked list :-->
    public Node add_last(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        } else if (head.next == null) {
            head.next = newNode;
            return head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            return head;
        }
    }

    // printing all the element present into the linkedlist :-->
    public void print_info(Node head) {
        if (head == null) {
            System.out.print("No element is present into the LinkedList");
        } else {
            while (head != null) {
                System.out.print(head.data);
                if (head.next != null) {
                    System.out.print(" --> ");
                }
                head = head.next;
            }
        }
    }

    // remove the first node from the Linked List :-->
    public Node remove_first(Node head) {
        if (head == null) {
            System.out.print("No element is present !!");
            return head;
        }
        head = head.next;
        return head;
    }

    // remove the last node from the linked list :-->
    public Node remove_last(Node head) {

        if (head == null) {
            System.out.print("No node is present!! ");
            return head;
        }
        if (head.next == null) {
            head = null;
            return head;
        }
        Node pre = head;
        Node post = head.next;

        while (post.next != null) {
            post = post.next;
            pre = pre.next;
        }
        pre.next = null;
        return head;

    }

    // remove the duplicate node from the linked list :-->
    public Node Remove_duplicate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node pre = head;
        while (pre.next != null) {
            if (pre.data == pre.next.data) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }

    // reverse the linked list :-->

    public Node reverse_the_list(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node pre = null;
        while (head != null) {
            Node next_Node = head.next;
            head.next = pre;
            pre = head;
            head = next_Node;
        }
        return pre;
    }

    // remove duplicate node from the unsorted linked list :-->
    public Node Remove_duplicates_from_an_unsorted_linked_list(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        HashSet<Integer> set = new HashSet<>();
        Node dummy = head;
        Node pre = null;

        while (dummy != null) {
            int curval = dummy.data;

            if (set.contains(curval)) {
                pre.next = dummy.next;
            } else {
                set.add(curval);
                pre = dummy;
            }
            dummy = dummy.next;
        }
        return head;
    }

    // Delete Node in Doubly Linked List
    public static Node Delete_node_in_doubly_linked_list(Node head, int value) {
        Node pre = head;
        Node dummy = null;

        while (pre.next != null) {
            dummy = pre;
            if (pre.data == value) {
                pre.data = pre.next.data;
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        if (pre.data == value) {
            dummy.next = null;
        }

        return head;
    }
}

public class Implement_LinkedList {
    public static void main(String[] args) {
        LL LL_implementation = new LL();
        Node root = null;

        // adding value at the first position into my linkedList :-->
        root = LL_implementation.add_first(8);
        root = LL_implementation.add_first(7);
        root = LL_implementation.add_first(6);
        root = LL_implementation.add_first(5);
        root = LL_implementation.add_first(5);
        root = LL_implementation.add_first(4);
        root = LL_implementation.add_first(2);
        root = LL_implementation.add_first(1);
        root = LL_implementation.add_first(1);

        // adding value at the last position into my linked list :-->
        root = LL_implementation.add_last(15);
        root = LL_implementation.add_last(15);
        root = LL_implementation.add_last(16);
        root = LL_implementation.add_last(17);
        root = LL_implementation.add_last(18);
        root = LL_implementation.add_last(19);

        // // printing all the element present into the linkedlist :-->
        // LL_implementation.print_info(root);
        // System.out.println();

        // // Remove the element from the first position of the linked list :-->
        // root = LL_implementation.remove_first(root);

        // // printing all the element present into the linkedlist :-->
        // LL_implementation.print_info(root);
        // System.out.println();

        // // remove the last node from the linked list :-->
        // root = LL_implementation.remove_last(root);

        // // printing all the element present into the linkedlist :-->
        // LL_implementation.print_info(root);
        // System.out.println();

        // // Remove the duplicate element from the linked list :-->
        // root = LL_implementation.Remove_duplicate(root);

        // // printing all the element present into the linkedlist :-->
        // LL_implementation.print_info(root);
        // System.out.println();

        // // Reverse the linkedList :-->
        // root = LL_implementation.reverse_the_list(root);

        // // printing all the element present into the linkedlist :-->
        // LL_implementation.print_info(root);
        // System.out.println();

        // // Reverse the linkedList :-->
        // root = LL_implementation.reverse_the_list(root);

        // // printing all the element present into the linkedlist :-->
        // LL_implementation.print_info(root);
        // System.out.println();

        // // printing all the element present into the linkedlist :-->
        // LL_implementation.print_info(root);
        // System.out.println();

        // // Remove the duplicate element from the unsorted linked list :-->
        // root =
        // LL_implementation.Remove_duplicates_from_an_unsorted_linked_list(root);

        // // printing all the element present into the linkedlist :-->
        // LL_implementation.print_info(root);
        // System.out.println();

        // Adding some element into linkedList
        root = LL_implementation.add_first(6);
        root = LL_implementation.add_first(5);
        root = LL_implementation.add_first(5);
        root = LL_implementation.add_first(4);
        root = LL_implementation.add_first(2);
        root = LL_implementation.add_first(1);
        root = LL_implementation.add_first(1);

        // printing all the element present into the linkedlist :-->
        LL_implementation.print_info(root);
        System.out.println();

        // Delete Node in Doubly Linked List
        root = LL_implementation.Delete_node_in_doubly_linked_list(root, 18);

        // printing all the element present into the linkedlist :-->
        LL_implementation.print_info(root);
        System.out.println();

    }
}
