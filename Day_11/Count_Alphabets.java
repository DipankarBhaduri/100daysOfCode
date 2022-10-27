package Day_11;

import java.util.*;

public class Count_Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = count_alphabet(s, n);
        sc.close();

        System.out.print(count);
    }

    public static int count_alphabet(String s, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }

        return count;
    }
}
