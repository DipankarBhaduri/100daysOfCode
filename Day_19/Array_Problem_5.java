package Day_19;

import java.util.*;

public class Array_Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int count = array_permutation(arr, target);
        System.out.print(count);

    }

    public static int array_permutation(int[] arr, int target) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + arr[i + 1] == target) {
                count++;
            }
        }

        return count;
    }
}
