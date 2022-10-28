/*

There is a sequence of words in camelCase as a string of letters, s , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given s , determine the number of words in s.

 */
package Day_12;

import java.util.*;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = count_word(s);
        sc.close();

        System.out.println(ans);
    }

    public static int count_word(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }

        return count + 1;
    }
}
