package Day_36;

import java.util.*;

public class AS_Loops_Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int longest_number = num;
        int smallest_number = num;
        char ch = sc.next().charAt(0);

        while (ch == 'Y' || ch == 'y') {
            num = sc.nextInt();
            longest_number = Math.max(num, longest_number);
            smallest_number = Math.min(smallest_number, num);
            ch = sc.next().charAt(0);
        }

        sc.close();
        System.out.println("Largest number: " + longest_number);
        System.out.println("Smallest number: " + smallest_number);

    }
}
