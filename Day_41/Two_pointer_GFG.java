package Day_41;

public class Two_pointer_GFG {
    public static void main(String[] args) {

    }
}

// First negative integer in every window of size k ( GFG )

class Compute {
    public long[] printFirstNegativeInteger(long A[], int N, int K) {
        long arr[] = new long[K];
        long[] ans = new long[N - K + 1];
        int idx = 0;

        for (int i = 0; i < K; i++) {
            arr[idx++] = A[i];
        }
        int temp = firstWindowNegative(arr);
        int idx2 = 0;
        ans[idx2++] = temp;

        for (int i = K; i < N; i++) {
            moveArray(arr);
            arr[K - 1] = A[i];
            int temp1 = firstWindowNegative(arr);
            ans[idx2++] = temp1;
        }
        return ans;
    }

    public static int firstWindowNegative(long[] arr) {
        int negative = 0;
        for (long val : arr) {
            if (val < negative) {
                negative = (int) val;
                break;
            }
        }
        return negative;
    }

    public static void moveArray(long[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}

// Length of longest subarray ( GFG )

class Compute1 {
    public long longestSubarry(long A[], int N) {
        long longestNonNegative = 0;
        int temp = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] >= 0) {
                temp++;
                longestNonNegative = Math.max(longestNonNegative, temp);
            } else {
                temp = 0;
            }
        }
        return longestNonNegative;
    }
}

// Message decoding ( GFG )

class Solution {
    public boolean decode(String S) {
        char[] ch = { 'h', 'e', 'l', 'l', 'o' };
        int n = S.length();
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char ch1 = S.charAt(i);
            if (ch1 == ch[idx]) {
                idx++;
                if (idx == 5) {
                    return true;
                }
            }
        }
        return false;
    }
}

// Delete Middle of Linked List ( GFG )

class Solution2 {
    Node deleteMid(Node head) {
        Node slow = head;
        Node fast = head;
        Node dummy = null;

        while (fast != null && fast.next != null) {
            dummy = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        dummy.next = slow.next;
        return head;
    }
}

// Maximum sum of subarray less than or equal to x ( GFG )

class Solution3 {
    long findMaxSubarraySum(long arr[], int N, int X) {
        int start = 0;
        long sum = 0;
        long ans = 0;

        for (int end = 0; end < N; end++) {

            sum += arr[end];
            while (sum > X) {
                sum -= arr[start];
                start++;
            }

            ans = Math.max(sum, ans);
        }

        return ans;
    }
}

// Reverse a linked list ( GFG )

class Solution4 {
    Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node pre = null;

        while (head != null) {
            Node next1 = head.next;
            head.next = pre;
            pre = head;
            head = next1;
        }

        return pre;
    }
}

// Remove duplicate element from sorted Linked List ( GFG )

class GfG {
    Node removeDuplicates(Node head) {
        if (head.next == null) {
            return head;
        }

        Node pre = head;
        Node result = pre;
        Node curr = head.next;

        while (curr != null) {
            if (curr.data != pre.data) {
                pre.next = curr;
                pre = pre.next;
            }
            curr = curr.next;
        }

        pre.next = null;

        return result;
    }
}

// Rotate a Linked List ( GFG )

class Solution5 {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {

        Node curr = head;
        int count = 1;
        Node temp = head;

        Node val = head;
        int count1 = 0;

        while (val != null) {
            val = val.next;
            count1++;
        }

        if (count1 == k) {
            return head;
        }

        while (count != k) {
            temp = temp.next;
            count++;
        }

        Node backup = temp.next;
        temp.next = null;

        Node ans = backup;

        while (backup.next != null) {
            backup = backup.next;
        }

        backup.next = curr;
        return ans;

    }
}