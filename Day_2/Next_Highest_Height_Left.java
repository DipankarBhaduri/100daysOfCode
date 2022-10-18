package Day_2;

import java.util.*;

public class Next_Highest_Height_Left {
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
        int idx = 1;
        result[0] = -1;

        for (int i = 1; i < n; i++) { // 6 9 4 18
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    count = i - j;
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
        return result; // -1 -1 1 -1
    }
}
