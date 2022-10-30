package Day_14;

import java.util.*;

public class Last_index_of_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int ans = last_one(s);
        System.out.print(ans);
    }

    static int last_one(String s) {
        int n = s.length();
        int ans = -1;

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '1') {
                return i;
            }
        }

        return ans;
    }
}
