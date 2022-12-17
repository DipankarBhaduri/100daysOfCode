package Day_61;

/*

Given a string and a non-empty substring sub, compute recursively the number of times 
that sub appears in the string, without the sub strings overlapping.


strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0

 */
import java.util.*;

public class strCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        sc.close();
        int ans = strCount(s1, s2);
        System.out.print(ans);

    }

    public static int strCount(String str, String sub) {
        if (sub.length() > str.length()) {
            return 0;
        }

        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }
}
