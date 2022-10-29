package Day_13;

import java.util.*;

public class remove_consecutive_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        char[] ch = s.toCharArray();

        sc.close();
        String ans = remove_duplicates(ch, n);
        System.out.print(ans);

    }

    public static String remove_duplicates(char[] ch, int n) {
        String str = "";

        str += ch[0];
        for (int i = 0; i < n - 1; i++) {
            if (ch[i] != ch[i + 1]) {
                str += ch[i + 1];
            }
        }

        return str;
    }

}
