package Day_23;

import java.util.*;

public class Accio_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sc.close();
        String ans = perfrom_accio_sort(s);
        System.out.print(ans);
    }

    static String perfrom_accio_sort(String s) {
        int n = s.length();

        Stack<Character> stk = new Stack<>();
        String[] arr = new String[9];
        int count = 0;
        int val = -1;
        int idx = -1;

        String str = "";

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            val = ch - '0';
            if (val < 10 && val > 0) {
                idx = val;
                count++;
            } else if (ch != ' ') {
                stk.push(ch);
            } else if (ch == ' ') {
                while (!stk.isEmpty()) {
                    str += stk.peek();
                    stk.pop();
                }
                arr[idx - 1] = str;
                str = "";
            }
        }

        while (!stk.isEmpty()) {
            str += stk.peek();
            stk.pop();
        }
        arr[idx - 1] = str;
        str = "";

        StringBuilder sb = new StringBuilder("");
        int c = 0;

        for (int i = 0; i < count; i++) {
            sb.append(arr[i]);
            c++;
            if (c != count) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
