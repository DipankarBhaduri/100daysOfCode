package Day_51;

public class OddEvenLinkedList {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode oddEvenList(final ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        final ListNode eHead = head.next;
        ListNode even = eHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = eHead;
        return head;
    }
}