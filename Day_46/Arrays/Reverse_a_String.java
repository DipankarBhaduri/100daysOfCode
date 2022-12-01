package Arrays;

/*
 * You are given a string s. You need to reverse the string.
 * 
 * Example 1:
 * Input:
 * s = Geeks
 * Output: skeeG
 * 
 * Example 2:
 * Input:
 * s = for
 * Output: rof
 * 
 */

class Reverse {
    public static String reverseWord(String str) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            char st = ch[start];
            char nd = ch[end];

            ch[start] = nd;
            ch[end] = st;

            start++;
            end--;
        }
        return new String(ch);
    }
}