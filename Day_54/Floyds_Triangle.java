package Day_54;

import java.util.*;

public class Floyds_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int idx = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(idx++ + " ");
            }
            System.out.println();
        }
    }
}
