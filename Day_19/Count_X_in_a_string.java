package Day_19;

import java.util.*;

public class Count_X_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int count_x = count_x(s);
        System.out.print(count_x);
    }

    public static int count_x(String s) {
        int n = s.length();
        int x_count = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'x') {
                x_count++;
            }
        }

        return x_count;
    }
}
