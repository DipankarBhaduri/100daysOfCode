package Day_14;

import java.util.*;

public class Count_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        String str = sc.next();

        while (testcase-- > 0) {
            String s = sc.nextLine();
            int result = count_word(s);
            System.out.println(result);
        }
        sc.close();
    }

    public static int count_word(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                count++;
            }

        }
        count++;

        return count;
    }
}
