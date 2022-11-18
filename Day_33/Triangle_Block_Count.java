package Day_33;

import java.util.*;

public class Triangle_Block_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        sc.close();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.print(sum);
    }
}
