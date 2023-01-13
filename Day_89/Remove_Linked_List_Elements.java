package Day_89;

import Day_89.Remove_Linked_List_Elements.Node;

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

        public Node add_last(int data) {
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
        if (head == null) {
            return;
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " -->> ");
                curr = curr.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 6, 3, 4, 5, 6 };
        int val = 6;
        Node root = null;
        LinkedList LL = new LinkedList();
        for (int i = 0; i < nums.length; i++) {
            root = LL.add_last(nums[i]);
        }
        print_info(root);
        Solution4 s4 = new Solution4();
        Node ans = s4.removeElements(root, val);
        print_info(ans);

    }
}

class Solution4 {
    public Node removeElements(Node head, int val) {
        Node pre = new Node(0);
        Node curr = head;
        Node track = pre;
        pre.next = curr;

        while (curr != null) {
            if (curr.data == val) {
                curr = curr.next;
            } else {
                pre.next = curr;
                pre = pre.next;
                curr = curr.next;
            }
        }
        pre.next = null;
        return track.next;
    }
}