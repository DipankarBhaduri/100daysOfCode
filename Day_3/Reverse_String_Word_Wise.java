package Day_3;

import java.util.*;

public class Reverse_String_Word_Wise {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase > 0) {
            String str = sc.nextLine();
            String ans = getResult(str);
            System.out.print(ans);
            testcase--;
        }
    }

    public static String getResult(String str) {
        Stack<String> STK = new Stack<>();
        String curr = "";
        int n = str.length();

        if (n == 1) {
            return str;
        }
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                STK.push(curr);
                curr = "";
            } else {
                curr += str.charAt(i);
            }
        }

        STK.push(curr);
        curr = "";

        StringBuilder sb = new StringBuilder("");

        while (!STK.isEmpty()) {
            sb.append(STK.peek());
            STK.pop();
            if (!STK.isEmpty()) {
                sb.append(" ");
            }
        }

        curr = sb.toString();
        return curr;
    }
}
