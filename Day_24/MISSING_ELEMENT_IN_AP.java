package Day_24;

import java.util.*;

public class MISSING_ELEMENT_IN_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int missingElement = check_missing_element_in_this_sequence(arr);
        System.out.print(missingElement);
    }

    static int check_missing_element_in_this_sequence(int[] arr) {

        int count = 0;
        int dif = 0;
        int ans = 0;

        for (int i = arr.length - 1; i > 0; i--) {
            if (count == 0) {
                dif = arr[i] - arr[i - 1];
            } else {
                if ((arr[i] - arr[i - 1]) != dif) {
                    ans = (arr[i] - dif);
                }
            }
            count++;
        }

        return ans;
    }
}
