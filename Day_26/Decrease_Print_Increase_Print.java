package Day_26;

import java.util.*;

public class Decrease_Print_Increase_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
