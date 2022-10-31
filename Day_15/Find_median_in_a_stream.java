package Day_15;

import java.util.*;

public class Find_median_in_a_stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        find_median(arr, n);
    }

    public static void find_median(int A[], int N) {
        // Declaring two min heap
        PriorityQueue<Double> g = new PriorityQueue<>();
        PriorityQueue<Double> s = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {

            // Negation for treating it as max heap
            s.add(-1.0 * A[i]);
            g.add(-1.0 * s.poll());
            if (g.size() > s.size())
                s.add(-1.0 * g.poll());

            if (g.size() != s.size())
                System.out.print((-1.0 * s.peek()) + " ");
            else
                System.out.print(((g.peek() - s.peek()) / 2) + " ");
        }
    }
}

// Input:
// 4
// 5 15 1 3
// Output:
// 5 10 5 4