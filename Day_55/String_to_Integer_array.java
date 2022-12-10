package Day_55;

import java.util.*;

public class String_to_Integer_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();
        ArrayList<Integer> list = arrayGenerator(s);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    static ArrayList<Integer> arrayGenerator(String s) {
        int n = s.length();
        ArrayList<Integer> list = new ArrayList<>();

        String temp = "";
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == ',') {
                String cur = temp;
                temp = "";
                int value = Integer.parseInt(cur);
                list.add(value);
            } else {
                temp += ch;
            }
        }

        int value = Integer.parseInt(temp);
        list.add(value);

        return list;
    }
}
