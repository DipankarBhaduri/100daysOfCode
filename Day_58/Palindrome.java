package Day_58;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        if (n == 1) {
            System.out.print("YES");
        }

        int start = 0;
        int end = n - 1;
        boolean flag = false;

        while (start < end) {
            if (arr[start] == arr[end]) {
                start++;
                end--;
            } else {
                System.out.print("NO");
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.print("YES");
        }
    }
}
