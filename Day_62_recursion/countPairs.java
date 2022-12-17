package Day_62_recursion;

/*

We'll say that a "pair" in a string is two instances of a char separated by a char. 
So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. 
Recursively compute the number of pairs in the given string.


countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1

 */
import java.util.*;

public class countPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        int ans = countPairs(s);
        System.out.print(ans);
    }

    public static int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        }

        if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        }

        return countPairs(str.substring(1));
    }
}
