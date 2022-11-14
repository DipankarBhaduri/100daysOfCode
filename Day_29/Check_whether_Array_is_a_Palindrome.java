package Day_29;

import java.util.*;

public class Check_whether_Array_is_a_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        System.out.print(check_palindrome(arr));
    }

    public static boolean check_palindrome(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start++] != arr[end--]) {
                return false;
            }
        }
        return true;
    }
}
