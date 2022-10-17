package Day_1;

public class Linked_List_implementation {
    public Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head.next == null) {
            head.next = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Print information
    public void print_info() {
        if (head == null) {
            System.out.print("Nothing is there to print !");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Delete first :->
    public void removeFirst() {
        if (head == null) {
            System.out.print("Nothing is there to Remove !");
            return;
        }

        head = head.next;
    }

    // Delete Last :->
    public void removeLast() {
        if (head == null) {
            System.out.print("Nothing is there to Remove !");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node nextNode = head.next;
        while (nextNode.next != null) {
            currNode = currNode.next;
            nextNode = nextNode.next;
        }
        currNode.next = null;
    }

    // linked List size
    public int getSize() {

        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }

        return size;
    }

    public static void main(String[] args) {
        Linked_List_implementation list = new Linked_List_implementation();
        list.addFirst(1);
        list.addFirst(0);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.print_info();

        System.out.println(list.getSize());

        list.removeFirst();
        list.print_info();
        System.out.println(list.getSize());

        list.removeLast();
        list.print_info();
        System.out.println(list.getSize());
    }
}
