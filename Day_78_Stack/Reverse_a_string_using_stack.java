package Day_78_Stack;

import java.util.*;

public class Reverse_a_string_using_stack {

    static String Reverse_String(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;

        while (index < str.length()) {
            char ch = str.charAt(index);
            index++;
            s.push(ch);
        }

        StringBuilder sb = new StringBuilder("");

        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }

        String result = sb.toString();
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        String result = Reverse_String(str);
        System.out.print(result);
        scn.close();
    }
}
