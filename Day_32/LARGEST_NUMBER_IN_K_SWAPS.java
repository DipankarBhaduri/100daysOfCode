package Day_32;

import java.util.*;

public class LARGEST_NUMBER_IN_K_SWAPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        sc.close();
        String ans = Solution.findMaximumNum(str, n);
        System.out.print(ans);
    }
}

class Solution {
    static String max;

    public static String findMaximumNum(String str, int k) {
        max = str;
        findMaximum(str.toCharArray(), k);
        return max;
    }

    public static void findMaximum(char[] strArr, int k) {
        if (k == 0)
            return;

        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[j] > strArr[i]) {
                    strArr = swap(strArr, i, j);
                    String st = new String(strArr);
                    if (max.compareTo(st) < 0)
                        max = st;
                    findMaximum(strArr, k - 1);
                    strArr = swap(strArr, i, j);
                }
            }
        }
    }

    public static char[] swap(char[] strArr, int i, int j) {
        char temp = strArr[i];
        strArr[i] = strArr[j];
        strArr[j] = temp;
        return strArr;
    }
}