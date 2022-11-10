package Day_25;

import java.util.*;

public class Capitalize_starting_of_each_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        sc.close();
        String ans = Capitalize_starting_of_each_word_in_a_string(str);
        System.out.print(ans);
    }

    public static String Capitalize_starting_of_each_word_in_a_string(String str) {
        int n = str.length();
        int count = 0;
        String carry = "";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            String cur = ""; // ------->> welcome to acciojob
            char ch = str.charAt(i);
            if (ch != ' ') {
                if (count == 0) {
                    cur += ch;
                    carry += cur.toUpperCase();
                } else {
                    carry += ch;
                }
                count++;
            } else {
                sb.append(carry);
                sb.append(" ");
                cur = "";
                carry = "";
                count = 0;
            }
        }

        sb.append(carry);
        carry = "";
        count = 0;
        return sb.toString();
    }
}
