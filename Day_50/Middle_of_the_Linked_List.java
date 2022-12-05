package Day_50;

public class Middle_of_the_Linked_List {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode ans = head;
        int count = 1;
        while (head != null) {

            if (count % 2 == 0)
                ans = ans.next;

            head = head.next;
            count++;

        }

        return ans;
    }
}