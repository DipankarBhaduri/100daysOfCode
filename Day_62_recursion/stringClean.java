package Day_62_recursion;

/*

Given a string, return recursively a "cleaned" string where adjacent chars that are 
the same have been reduced to a single char. So "yyzzza" yields "yza".


stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"

 */
import java.util.*;

public class stringClean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = stringClean(s);
        System.out.print(ans);
    }

    public static String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            return str.substring(0, 1).concat(stringClean(str.substring(1)));
        }
    }
}
