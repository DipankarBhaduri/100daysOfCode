package Day_15;

import java.util.*;

public class Largest_Number_after_k_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        String ans = largest_number_after_k_operation(s, k);
        System.out.print(ans);
    }

    public static String largest_number_after_k_operation(String s, int k) {

        int n = s.length();
        String ans = "";
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch != '9' && count < k) {
                count++;
                ans += '9';
            } else if (ch == '9') {
                ans += ch;
            } else {
                ans += ch;
            }
        }

        return ans;
    }
}

// 569431 3

// 999931