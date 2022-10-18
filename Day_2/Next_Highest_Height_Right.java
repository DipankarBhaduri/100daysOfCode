package Day_2;

import java.util.*;

public class Next_Highest_Height_Right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = Next_height_Right(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] Next_height_Right(int[] arr) {
        int n = arr.length;
        int count = 0;
        int result[] = new int[n];
        int idx = 0;

        for (int i = 0; i < n - 1; i++) { // 6 9 4 18
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    count = j - i;
                    break;
                }
            }
            if (count == 0) {
                result[idx++] = -1;
            } else {
                result[idx++] = count;
                count = 0;
            }
        }

        result[n - 1] = -1;
        return result; // 1 2 1 -1
    }
}

/*
 * Example 1
 * Input
 * 
 * 4
 * 6 9 4 18
 * Output
 * 
 * 1 2 1 -1
 * Explanation
 * 
 * Except 18, every element has an element greater than them present on the
 * right side of it.
 * 
 * Example 2
 * Input
 * 
 * 4
 * 21 11 6 19
 * Output
 * 
 * -1 2 1 -1
 */