/*

Given an integer an N. The task is to return the position of first set bit found from the right 
side in the binary representation of the number.
Note: If there is no set bit in the integer N, then return 0 from the function.

Example 1:

Input: N = 18 Output: 2 Explanation: Binary representation of 18 is 010010,
the first set bit from the right side is at position 2.

 */

package Day_2;

import java.util.*;

public class Find_first_set_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(getResult(n));
    }

    public static int getResult(int n) {
        for (int i = 0; i <= 32; i++) {
            int bitmask = 1 << i;
            if ((n & bitmask) != 0) {
                return (i + 1);
            }
        }
        return -1;
    }
}