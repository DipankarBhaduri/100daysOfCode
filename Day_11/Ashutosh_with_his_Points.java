package Day_11;

import java.util.*;

public class Ashutosh_with_his_Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = ashutosh_problem(arr);
        System.out.print(ans);
    }

    public static int ashutosh_problem(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                return i;
            }
        }

        return -1;
    }
}
