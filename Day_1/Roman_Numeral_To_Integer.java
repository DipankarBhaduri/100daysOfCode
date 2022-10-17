/*

Given a string that represents a roman number. Convert the roman number to an integer and return it.
Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M. Table Of Values:
Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000

For Example, 3 is written as III in Roman numeral, just three ones added together. 
13 is written as XIII, which is simply X + III. The number 25 is written as XXV, which is XX + V

Input Format : The first line of input contains an integer ‘T’ denoting the number of test cases. 
The next ‘T’ lines represent the ‘T’ test cases.

 */

package Day_1;

import java.util.*;

public class Roman_Numeral_To_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase > 0) {
            String str = sc.next();
            System.out.print(Roman_to_integer(str) + " ");
            testcase--;
        }
    }

    public static int Roman_to_integer(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(str.charAt(str.length() - 1));

        for (int i = str.length() - 2; i >= 0; i--) {
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                result -= map.get(str.charAt(i));
            } else {
                result += map.get(str.charAt(i));
            }
        }

        return result;
    }
}
