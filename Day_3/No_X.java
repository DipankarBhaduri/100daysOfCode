//Given a string, compute recursively a new string where all the 'x' chars have been removed.

package Day_3;

import java.util.*;

public class No_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        int idx = 0;

        No_x_string(str, ans, str.length(), idx);
    }

    public static void No_x_string(String str, String ans, int n, int idx) {
        if (idx == n) {
            System.out.print(ans);
            return;
        }

        if (str.charAt(idx) != 'x') {
            ans += str.charAt(idx);
        }

        No_x_string(str, ans, n, idx + 1);
    }
}
