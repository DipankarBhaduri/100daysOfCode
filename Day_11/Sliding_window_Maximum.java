package Day_11;

import java.util.*;

public class Sliding_window_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int window = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        window_maximum(arr, window);
    }

    public static void window_maximum(int[] arr, int target) {
        if (arr.length == 1 && target == 1 && arr[0] == 1) {
            System.out.print(1);
            return;
        }

        Queue<Integer> Q = new LinkedList<>();
        Queue<Integer> Q1 = new LinkedList<>();

        int max = arr[0];

        for (int i = 0; i < target; i++) {
            Q.add(arr[i]);
        }

        while (!Q.isEmpty()) {
            int curr = Q.peek();
            max = Math.max(max, curr);
            Q1.add(Q.poll());
        }
        while (!Q1.isEmpty()) {
            Q.add(Q1.poll());
        }

        System.out.print(max + " ");
        Q.poll();

        for (int i = target; i < arr.length; i++) {
            Q.add(arr[i]);
            max = -222;

            while (!Q.isEmpty()) {
                int curr = Q.peek();
                max = Math.max(max, curr);
                Q1.add(Q.poll());
            }

            while (!Q1.isEmpty()) {
                Q.add(Q1.poll());
            }

            Q.poll();
            System.out.print(max + " ");

        }

    }
}
