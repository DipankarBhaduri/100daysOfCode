package Day_23;

import java.util.*;

public class AS_Pattern_Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();
        for (int i = ch; i >= 65; i--) {
            char c = ch--;
            for (int j = i; j >= 65; j--) {

                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
