package Day_23;

import java.util.*;

public class Change_Hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        sc.close();
        int count_hi = calculate_the_count_hi(s, n);
        System.out.print(count_hi);
    }

    static int calculate_the_count_hi(String str, int n) {
        int count = 0;
        if (str.length() < 2) {
            return 0;
        } else {
            for (int i = 0; i < str.length() - 1; i++) {
                if ((str.charAt(i) == 'h') && (str.charAt(i + 1) == 'i'))
                    count += 1;
            }
        }
        return count;
    }
}
