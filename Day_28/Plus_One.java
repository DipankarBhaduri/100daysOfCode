package Day_28;

import java.util.*;

public class Plus_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans[] = plusOne(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int count9 = 0;
        for (int val : digits) {
            if (val == 9) {
                count9++;
            }
        }

        if (count9 == n) {
            int[] arr = new int[n + 1];
            arr[0] = 1;
            return arr;
        } else {
            boolean b = false;
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    b = true;
                    digits[i] = 0;
                } else {
                    if (b && digits[i] == 9) {
                        digits[i] = 0;
                    } else {
                        digits[i] = digits[i] + 1;
                        b = false;
                        break;
                    }
                }
            }
        }
        return digits;
    }
}
