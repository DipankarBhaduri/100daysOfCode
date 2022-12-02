package Day_47;

import java.util.*;

public class Split_Odd10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        boolean b = check_split_odd(arr);
        if (b == true) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    public static boolean check_split_odd(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];

        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp += arr[i];
            nums[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            if ((nums[i] % 10 == 0) && ((nums[n - 1] - nums[i]) % 2 != 0)) {
                return true;
            }
        }

        return false;
    }
}
