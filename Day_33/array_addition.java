package Day_33;

import java.util.*;

public class array_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        int ans[] = array_addition_of_two(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

    public static int[] array_addition_of_two(int[] arr1, int[] arr2) {
        int num1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            int val = arr1[i];
            num1 = num1 * 10 + val;
        }

        int num2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            int val = arr2[i];
            num2 = num2 * 10 + val;
        }

        int result = num1 + num2;
        int count = 0;
        int temp = result;

        while (temp > 0) {
            int rem = temp % 10;
            count++;
            temp = temp / 10;
            num2 = rem;
        }

        int ans[] = new int[count];

        while (result > 0) {
            int val = result % 10;
            ans[--count] = val;
            result = result / 10;
        }

        return ans;
    }
}
