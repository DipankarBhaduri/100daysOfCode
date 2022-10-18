package Day_2;

import java.util.*;

public class Min_and_Max_difference_between_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = minimum_and_Maximum_price_difference(arr);
        System.out.print(ans[0] + " " + ans[1]);
    }

    public static int[] minimum_and_Maximum_price_difference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans[] = new int[2];
        int minimum_differ = arr[1] - arr[0];
        ;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) < minimum_differ) {
                minimum_differ = arr[i + 1] - arr[i];
            }
        }

        ans[0] = minimum_differ;
        ans[1] = arr[n - 1] - arr[0];
        return ans;
    }
}

/*
 * 
 * Input Format
 * Input consists of two lines.
 * 
 * First line contains an integer n.
 * 
 * Next line contains n spaced integers.
 * 
 * Output Format
 * Print the minimum and maximum price differences respectively.
 * 
 * Example 1
 * Input
 * 6
 * 7 1 5 3 6 4
 * Output
 * 1 6
 * 
 */