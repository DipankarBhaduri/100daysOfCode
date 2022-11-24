package Day_39;

public class LinkedList_LeetCode {
    public static void main(String[] args) {

    }
}

// 2181. Merge Nodes in Between Zeros ( LeetCode ) -->>
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode abc = null;
        ListNode temp = head;
        int sum = 0;

        while (temp != null) {
            if (temp.val == 0 && sum != 0) {
                ListNode node1 = new ListNode(sum);
                if (abc == null) {
                    abc = node1;
                } else {
                    ListNode xyz = abc;
                    while (xyz.next != null) {
                        xyz = xyz.next;
                    }
                    xyz.next = node1;
                }
                sum = 0;
            } else {
                sum += temp.val;
            }
            temp = temp.next;
        }

        return abc;
    }
}

// 1290. Convert Binary Number in a Linked List to Integer ( LeetCode )

class Solution1 {
    public int getDecimalValue(ListNode head) {
        String str = "";

        while (head != null) {
            int num = head.val;
            String temp = Integer.toString(num);
            str += temp;
            head = head.next;
        }

        return Integer.parseInt(str, 2);
    }
}

// 237. Delete Node in a Linked List ( LeetCode )

class Solution2 {
    public void deleteNode(ListNode node) {
        ListNode prev = node;
        ListNode curr = node.next;
        prev.val = curr.val;
        prev.next = curr.next;
    }
}

// 1721. Swapping Nodes in a Linked List ( LeetCode )

class Solution3 {
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;
        int fst_k = 0;
        int last_k = 0;

        while (temp != null) {
            length++;
            if (length == k) {
                fst_k = temp.val;
            }
            temp = temp.next;
        }

        temp = head;
        int counter = 0;

        while (temp != null) {
            counter++;
            if (counter == (length - k + 1)) {
                last_k = temp.val;
            }
            temp = temp.next;
        }

        temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            if (c == k) {
                temp.val = last_k;
            }

            if (c == (length - k + 1)) {
                temp.val = fst_k;
            }
            temp = temp.next;
        }

        return head;
    }
}