package Day_10;

import java.util.*;

public class Lone_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = lone_ele(arr);
            System.out.println(ans);
        }
        sc.close();
    }

    public static int lone_ele(int[] arr) {
        int ans = 0;
        for (int val : arr) {
            ans ^= val;
        }

        return ans;
    }
}

// 1
// 5
// 1 1 2 3 3