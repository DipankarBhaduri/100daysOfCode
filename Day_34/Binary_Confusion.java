package Day_34;

import java.util.*;

public class Binary_Confusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Binary_Confusion_1(n);
        sc.close();
    }

    public static void Binary_Confusion_1(int n) {
        Stack<Integer> stk = new Stack<>();

        while (n > 0) {
            int rem = n % 2;
            stk.push(rem);
            n = n / 2;
        }

        while (!stk.isEmpty()) {
            System.out.print(stk.peek());
            stk.pop();
        }
    }
}
