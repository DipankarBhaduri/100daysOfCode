package Day_62_recursion;

/*
Given a string, compute recursively a new string where all the adjacent 
chars are now separated by a "*".


allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"

 */
import java.util.*;

public class allStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = allStar(s);
        System.out.print(ans);
    }

    public static String allStar(String str) {
        if (str.length() < 2) {
            return str;
        }

        return str.substring(0, 1).concat("*".concat(allStar(str.substring(1))));

    }
}