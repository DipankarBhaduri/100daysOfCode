package Day_62_recursion;

import java.util.*;

/*

Given a string, compute recursively a new string where all 
the 'x' chars have been removed.


noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""

 */
public class noX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = noX(s);
        System.out.print(ans);
    }

    public static String noX(String str) {
        if (str.length() < 1) {
            return "";
        }

        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        } else {
            return str.substring(0, 1).concat(noX(str.substring(1)));
        }
    }
}
