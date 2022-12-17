package Day_62_recursion;

/*
Given a string, compute recursively a new string where identical chars that are adjacent in 
the original string are separated from each other by a "*".


pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"

 */
import java.util.*;

public class pairStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = pairStar(s);
        System.out.print(ans);

    }

    public static String pairStar(String str) {
        if (str.length() < 2) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return str.substring(0, 1).concat("*".concat(pairStar(str.substring(1))));
        }
        return str.substring(0, 1).concat(pairStar(str.substring(1)));
    }
}
