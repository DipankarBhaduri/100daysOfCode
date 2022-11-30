package Day_45;

import java.util.*;

public class Linked_List {
    public static void main(String[] args) {

    }
}

// Remove loop in Linked List ( GFG )

class Solution {
    public static void removeLoop(Node head) {
        Set<Node> map = new HashSet<>();
        Node prev = null;
        Node head1 = head;

        while (head1 != null) {
            if (map.contains(head1)) {
                prev.next = null;
                return;
            }
            prev = head1;
            map.add(head1);
            head1 = head1.next;
        }
    }
}

// Reverse a String ( GFG ) ( logN)

class Reverse {
    public static String reverseWord(String str) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            char st = ch[start];
            char nd = ch[end];

            ch[start] = nd;
            ch[end] = st;

            start++;
            end--;
        }
        return new String(ch);
    }
}

// Maximum Subarray ( LeetCode )

class Solution4 {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maximumSum = Math.max(maximumSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maximumSum;
    }
}