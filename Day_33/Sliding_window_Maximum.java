package Day_33;

import java.util.*;

public class Sliding_window_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int windowSize = sc.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        windowMax(arr, windowSize);
        int[] val = maxSlidingWindow(arr, windowSize);
        System.out.println();

        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i] + " ");
        }
    }

    public static void windowMax(int[] arr, int windowSize) {
        int ans[] = new int[windowSize];
        int end = 0;
        for (int i = 0; i < windowSize; i++) {
            ans[end++] = arr[i];
        }
        int max = helper_of_finding_windowMax(ans);
        System.out.print(max + " ");

        if (arr.length > windowSize) {
            for (int i = windowSize; i < arr.length; i++) {
                int value = arr[i];
                int[] result = add_new_value_into_the_window(ans, value);
                int temp = helper_of_finding_windowMax(result);
                System.out.print(temp + " ");
            }
        }
    }

    public static int helper_of_finding_windowMax(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        return arr[n - 1];
    }

    public static int[] add_new_value_into_the_window(int[] arr, int value) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = value;
        return arr;
    }

    public static int[] maxSlidingWindow(int[] a, int k) {
        if (a == null || k <= 0) {
            return new int[0];
        }
        int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
        // store index
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {
            // remove numbers out of range k
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }
            // q contains index... r contains content
            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
    }
}