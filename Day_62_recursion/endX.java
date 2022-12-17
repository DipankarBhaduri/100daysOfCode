package Day_62_recursion;

/*

Given a string, compute recursively a new string where all the lowercase 'x' chars 
have been moved to the end of the string.


endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"

*/

import java.util.*;

public class endX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = endX(s);
        System.out.print(ans);
    }

    public static String endX(String str) {
        if (str.length() == 0)
            return str;
        if (str.charAt(0) == 'x')
            return endX(str.substring(1)) + 'x';
        return str.charAt(0) + endX(str.substring(1));
    }
}
