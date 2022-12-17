package Day_62_recursion;

/*

Count recursively the total number of "abc" and "aba" substrings 
that appear in the given string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2

 */
import java.util.*;

public class countAbc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        int ans = countAbc(s);
        System.out.print(ans);
    }

    public static int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }

        if (str.subSequence(0, 3).equals("abc") || str.subSequence(0, 3).equals("aba")) {
            return 1 + countAbc(str.substring(1));
        } else {
            return countAbc(str.substring(1));
        }
    }
}
