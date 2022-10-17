package Day_1;

import java.util.*;

public class Delete_the_nth_Node_from_end_in_LinkedList {
    static Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    // return the size of Linked List
    public int length_of_linkedList() {
        int size = 0;
        Node curNode = head;
        while (curNode != null) {
            size++;
            curNode = curNode.next;
        }
        return size;
    }

    // Print info
    public void print_info() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Delete nth Node from the end and return the value
    public static int Delete_nth_Node(int n, int length) {
        // so actually from head ( length - n + 1) node need to delete
        int NodeNeedToRemove = length - n + 1;
        int counter = 2;
        Node currNode = head;
        Node nextNode = head.next;

        while (counter != NodeNeedToRemove) {
            currNode = currNode.next;
            nextNode = nextNode.next;
            counter++;
        }

        currNode.next = nextNode.next;
        return nextNode.data;
    }

    public static void main(String[] args) {
        Delete_the_nth_Node_from_end_in_LinkedList list = new Delete_the_nth_Node_from_end_in_LinkedList();
        Scanner sc = new Scanner(System.in);

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.print_info();

        int size = list.length_of_linkedList();
        System.out.print("Which node want to delete from Linked List End : ");
        int n = sc.nextInt();

        // here nth element need to remove from linked list
        System.out.println(n + "th Node or " + Delete_nth_Node(n, size) +
                " Deleted from Linked List & here is the updated list ");
        list.print_info();
    }
}
