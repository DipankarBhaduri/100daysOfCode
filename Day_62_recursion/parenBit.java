package Day_62_recursion;

import java.util.*;

/*

Given a string that contains a single pair of parenthesis, 
compute recursively a new string made of only of the parenthesis and their contents, 
so "xyz(abc)123" yields "(abc)".


parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"

 */
public class parenBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = parenBit(s);
        System.out.print(ans);

    }

    static String parenBit(String str) {
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return str;
        }

        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        } else if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        } else {
            return str;
        }

    }
}
