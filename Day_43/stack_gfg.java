package Day_43;

import java.util.*;

public class stack_gfg {
    public static void main(String[] args) {

    }
}

// Next Greater Element ( GFG )

class Solution {
    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Long> map = new Stack<>();

        long ans[] = new long[n];

        map.push(arr[n - 1]);

        ans[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {

            while (map.size() > 0 && arr[i] >= map.peek())
                map.pop();

            if (map.size() == 0)
                ans[i] = -1;

            else
                ans[i] = map.peek();

            map.push(arr[i]);
        }

        return ans;
    }
}

// Immediate Smaller Element ( GFG )

class Solution1 {
    void immediateSmaller(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }

        arr[n - 1] = -1;
    }
}

// Delete middle element of a stack ( GFG )

class Solution3 {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        Stack<Integer> stk = new Stack<>();
        int count = 0;

        while (count < sizeOfStack / 2) {
            stk.push(s.pop());
            count++;
        }

        s.pop();

        while (!stk.isEmpty()) {
            s.push(stk.pop());
        }
    }
}

// Reverse a Stack ( GFG )

class Solution4 {
    static void reverse(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        while (!q.isEmpty()) {
            s.push(q.poll());
        }
    }
}
