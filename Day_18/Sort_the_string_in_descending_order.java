package Day_18;

import java.util.*;

public class Sort_the_string_in_descending_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String str = descending_order(s);
        System.out.print(str);
    }

    public static String descending_order(String s) {
        int n = s.length();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);

        String str = "";
        for (int i = n - 1; i >= 0; i--) {
            str += ch[i];
        }

        return str;
    }
}
