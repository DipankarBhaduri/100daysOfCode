package Day_47;

import java.util.*;

public class String_Cleaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = findString(str);
        System.out.println(ans);
        sc.close();
    }

    public static String findString(String str) {
        char ch[] = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        char c = ch[0];
        list.add(c);

        for (int i = 1; i < ch.length; i++) {
            char cur = ch[i];
            if (c != cur) {
                list.add(cur);
            }
            c = cur;
        }

        String ans = "";
        for (int i = 0; i < list.size(); i++) {
            char val = list.get(i);
            ans += val;
        }

        return ans;
    }}
