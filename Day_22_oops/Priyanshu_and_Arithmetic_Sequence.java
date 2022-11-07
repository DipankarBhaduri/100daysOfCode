package Day_22_oops;

import java.util.*;

public class Priyanshu_and_Arithmetic_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int[] arr = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        if (check_the_sequence(arr)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    static boolean check_the_sequence(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + diff != arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
