package Day_27;

import java.util.*;

public class Max_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int value = ch[i] - '0';
            System.out.println(value);
            if (value != (-16)) {
                max = Math.max(value, max);
            }
        }
        sc.close();
        System.out.print(max);
    }
}
