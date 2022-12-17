package Day_62_recursion;

import java.util.*;

/*

Given a string, compute recursively (no loops) a new string where 
all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"

 */
public class changeXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        String ans = changeXY(s);
        System.out.print(ans);
    }

    public static String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }

        if (str.charAt(0) == 'x') {
            return "y".concat(changeXY(str.substring(1)));
        } else {
            return str.substring(0, 1).concat(changeXY(str.substring(1)));
        }
    }
}
