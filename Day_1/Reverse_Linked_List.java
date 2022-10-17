package Day_1;

import java.util.*;

public class Reverse_Linked_List {

    static Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add First
    public void add_first(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print_info() {
        if (head == null) {
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        Reverse_Linked_List list = new Reverse_Linked_List();
        while (copy > 0) {
            list.add_first(sc.nextInt());
            copy--;
        }
        list.print_info();
    }
}
