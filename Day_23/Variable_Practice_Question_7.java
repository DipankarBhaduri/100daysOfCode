package Day_23;

import java.util.*;

public class Variable_Practice_Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextInt();

        sc.close();
        float area = (float) 3.14 * r * r;
        float perimeter = (float) 3.14 * 2 * r;

        System.out.println((int) area);
        System.out.print((int) perimeter);

    }
}
