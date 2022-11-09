package Day_24;

import java.util.*;

public class Nearest_multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n <= 5) {
            System.out.print(0);
        } else if (n <= 15) {
            System.out.print(10);
        } else {
            int rem = n % 10;
            int cur = n / 10;
            if (rem <= 5) {
                System.out.print(cur * 10);
            } else {
                System.out.print((cur + 1) * 10);
            }
        }
    }
}
