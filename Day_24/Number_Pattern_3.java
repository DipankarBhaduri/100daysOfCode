package Day_24;

import java.util.*;

public class Number_Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        Number_Pattern(n);
    }

    public static void Number_Pattern(int n) {
        int one = 1;
        int two = 2;
        for (int i = 0; i < n; i++) {
            int diff = i - 0;
            for (int j = 0; j <= i; j++) {
                if (diff <= 1) {
                    System.out.print(one);
                } else {
                    if (j == 0 || j == i) {
                        System.out.print(one);
                    } else {
                        System.out.print(two);
                    }
                }
            }
            System.out.println();
        }
    }
}
