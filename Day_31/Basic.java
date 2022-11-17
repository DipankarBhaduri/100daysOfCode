package Day_31;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 5;
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        sc.close();
        float mul = num1 * num3 * num2;
        float add = num1 + num2 + num3;
        System.out.println(mul);
        System.out.println(add);

        float ans = mul / add;
        System.out.printf("%.2f", ans);
        System.out.println();
        System.out.print(mul / add);

    }
}
