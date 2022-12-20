package Day_65;

import java.util.*;

public class Queue_implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        while (t-- > 0) {
            int num = sc.nextInt();
            if (num == 1) {
                int temp = sc.nextInt();
                q.add(temp);
            } else if (num == 2) {
                if (!q.isEmpty()) {
                    int temp = q.poll();
                    System.out.println(temp);
                } else {
                    System.out.println(-1);
                }
            } else if (num == 3) {
                if (!q.isEmpty()) {
                    int temp = q.peek();
                    System.out.println(temp);
                } else {
                    System.out.println(-1);
                }
            } else if (num == 4) {
                System.out.println(q.size());
            }
        }
        sc.close();

    }
}
