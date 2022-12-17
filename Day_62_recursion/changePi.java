package Day_62_recursion;

import java.util.*;

/*

Given a string, compute recursively (no loops) a new string where 
all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"

 */
public class changePi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = changePi(s);
        System.out.print(ans);
    }

    public static String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }

        if (str.substring(0, 2).equals("pi")) {
            return "3.14".concat(changePi(str.substring(2)));
        } else {
            return str.substring(0, 1).concat(changePi(str.substring(1)));
        }
    }
}
