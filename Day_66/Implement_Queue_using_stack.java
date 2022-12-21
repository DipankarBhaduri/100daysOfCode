package Day_66;

import java.util.*;

public class Implement_Queue_using_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        while (t-- > 0) {
            int num = sc.nextInt();
            if (num == 1) {
                q.add(sc.nextInt());
            } else if (num == 2) {
                if (!q.isEmpty()) {
                    System.out.print(q.poll() + " ");
                } else {
                    System.out.print(-1 + " ");
                }
            }
        }
    }
}
