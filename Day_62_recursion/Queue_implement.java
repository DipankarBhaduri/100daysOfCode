package Day_62_recursion;

import java.util.*;

public class Queue_implement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int t = sc.nextInt();

        while (t-- > 0) {
            int num = sc.nextInt();
            if (num == 1) {
                int val = sc.nextInt();
                q.add(val);
            } else if (num == 2) {
                if (!q.isEmpty()) {
                    System.out.println(q.poll());
                } else {
                    System.out.println(-1);
                }
            } else if (num == 3) {
                if (!q.isEmpty()) {
                    System.out.println(q.peek());
                } else {
                    System.out.println(-1);
                }
            } else {
                System.out.println(q.size());
            }
        }
    }
}
