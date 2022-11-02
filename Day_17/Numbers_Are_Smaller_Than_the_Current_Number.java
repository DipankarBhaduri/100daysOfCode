package Day_17;

import java.util.*;

public class Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        smaller_then_current_element(arr);
    }

    public static void smaller_then_current_element(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int cur = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < cur) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
