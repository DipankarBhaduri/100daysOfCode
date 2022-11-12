package Day_27;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LL {
    Node head;

    void add_last(int data) {
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

    void prin_info(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
}

public class Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LL list1 = new LL();
        int n = sc.nextInt();
        while (n-- > 0) {
            list1.add_last(sc.nextInt());
        }

        LL list2 = new LL();
        int n1 = sc.nextInt();
        while (n1-- > 0) {
            list2.add_last(sc.nextInt());
        }

        LL list3 = new LL();
        sc.close();
        Node fst = list1.head;
        Node snd = list2.head;
        while (fst != null && snd != null) {
            if (fst.data <= snd.data) {
                list3.add_last(fst.data);
                fst = fst.next;
            } else {
                list3.add_last(snd.data);
                snd = snd.next;
            }
        }

        while (fst != null) {
            list3.add_last(fst.data);
            fst = fst.next;
        }

        while (snd != null) {
            list3.add_last(snd.data);
            snd = snd.next;
        }

        list3.prin_info(list3.head);
    }
}
