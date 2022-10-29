package Day_13;

import java.util.*;

public class CHECK_IF_TWO_ARRAYS_ARE_EQUAL_OR_NOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(check_equal_or_not(arr1, arr2, n));

    }

    public static int check_equal_or_not(int[] arr1, int[] arr2, int n) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return 0;
            }
        }
        return 1;

    }
}
