package Day_2;

import java.util.*;

public class Reverse_the_string_word_wise_and_Decode_it {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // input ---> mis2ing the world
        String result = Reverse_and_decode(str);
        System.out.print(result); // Output --> world the missing
    }

    public static String Reverse_and_decode(String str) {
        int size = str.length();
        Stack<String> stk = new Stack<>();
        String curStr = "";

        for (int i = 0; i < size; i++) {

            if (str.charAt(i) != ' ') {
                if (Character.isDigit(str.charAt(i))) {
                    int num = (str.charAt(i) - '0');
                    for (int j = 0; j < num - 1; j++) {
                        curStr += curStr.charAt(curStr.length() - 1);
                    }
                } else {
                    curStr += str.charAt(i);
                }
            } else {
                stk.push(curStr);
                curStr = "";
            }
        }

        stk.push(curStr);
        curStr = "";

        StringBuilder sb = new StringBuilder("");

        while (!stk.isEmpty()) {
            sb.append(stk.peek());
            stk.pop();
            if (!stk.isEmpty()) {
                sb.append(" ");
            }
        }

        curStr = sb.toString();
        return curStr;
    }
}
