/*
Ram is the class representative and he has been given the class list by his 
teacher and has been asked to make sure the names of all the students are correct.

He notices that some names have random capitalization in the letters.

He decides to write a piece of code to capitalize only the first letter of each 
word in the name. Can you help Ram in achieving his goal?

 */

package Day_13;

import java.util.*;

public class Rectify_the_Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ans = word_capitalized(name);

        sc.close();
        System.out.print(ans);
    }

    public static String word_capitalized(String name) {
        int n = name.length();
        String final_name = "";

        final_name += name.charAt(0);
        final_name = final_name.toUpperCase();

        for (int i = 1; i < n; i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                if (name.charAt(i - 1) == ' ') {
                    String s = "";
                    s += ch;
                    final_name += s.toUpperCase();
                } else {
                    String ss = "";
                    ss += ch;
                    final_name += ss.toLowerCase();

                }

            } else {
                final_name += ' ';

            }
        }

        return final_name;
    }

}
