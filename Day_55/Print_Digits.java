package Day_55;

import java.util.*;

public class Print_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        print_all_digits(n);
    }

    static void print_all_digits(int n) {
        Stack<Integer> stk = new Stack<>();

        while (n > 0) {
            int rem = n % 10;
            stk.push(rem);
            n = n / 10;
        }

        while (!stk.isEmpty()) {
            System.out.println(stk.pop());
        }
    }
}
