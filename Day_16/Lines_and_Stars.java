package Day_16;

import java.util.*;

public class Lines_and_Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int star = sc.nextInt();
        sc.close();

        print(line, star);
    }

    public static void print(int line, int star) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
