/*

Given an array 'A' with 'n' positive integers.
Your task is to calculate the distance between every integer and the next closest 
integer with value greater than it. If next greater integer doesn't exist print -1 
for that particular integer.

 */
package Day_12;

import java.util.*;

public class Next_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            next_max(arr);
            System.out.println();

        }
        sc.close();
    }

    public static void next_max(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int max = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = j - i;
                    break;
                }

            }
            System.out.print(max + " ");
        }
        System.out.print(-1);
    }
}
