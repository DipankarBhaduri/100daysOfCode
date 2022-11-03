package Day_18;

import java.util.*;

// 12
// 8 6 3 4 5 9 12 7 20 22 31 38
public class Subarray_Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = count_incressing_subarray(arr);
        System.out.print(ans);

    }

    public static int count_incressing_subarray(int[] arr) {
        if (arr.length < 4) {
            return 0;
        }
        int count = 0;
        int curr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            curr[i] = arr[i];
        }
        count = helper_of_count_incressing_subarray(curr);

        for (int i = 4; i < arr.length; i++) {
            curr[0] = curr[1];
            curr[1] = curr[2];
            curr[2] = curr[3];
            curr[3] = arr[i];
            int temp = helper_of_count_incressing_subarray(curr);
            count += temp;
        }
        return count;
    }

    public static int helper_of_count_incressing_subarray(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}
