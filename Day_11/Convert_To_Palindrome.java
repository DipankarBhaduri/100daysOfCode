/*

Given a string S consisting only of lowercase characters.
We need to check whether it is possible to make this 
string a palindrome after removing exactly 
one character from this.

 */

package Day_11;

import java.util.*;

public class Convert_To_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int ans = palindrome_checker(str);
        System.out.print(ans);
    }

    public static int palindrome_checker(String str) {
        int n = str.length();
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }

        int start = 0;
        int end = n - 1;
        int count = 0;

        while (start <= end) {
            if (str.charAt(start++) == str.charAt(end--)) {

            } else if ((str.charAt(start) == str.charAt(--end)) && count < 2) {
                count++;
            } else if ((str.charAt(++start) == str.charAt(end)) && count < 2) {
                count++;
            } else {
                return 0;
            }
        }
        if (count < 2) {
            return 1;
        } else {
            return 0;
        }

    }
}
