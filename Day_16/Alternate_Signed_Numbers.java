package Day_16;

import java.util.*;

public class Alternate_Signed_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        if (check_alternate_signed_number(arr)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean check_alternate_signed_number(int[] arr) {
        int n = arr.length;

        if (arr[0] < 0) {

            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    if (arr[i] < 0) {
                    } else {
                        return false;
                    }
                } else {
                    if (arr[i] > 0) {
                    } else {
                        return false;
                    }
                }
            }

        } else {
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    if (arr[i] > 0) {
                    } else {
                        return false;
                    }
                } else {
                    if (arr[i] < 0) {
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
