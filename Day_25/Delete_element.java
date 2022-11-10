package Day_25;

import java.util.*;

public class Delete_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        sc.close();
        Delete_the_target_element(arr, target);
    }

    public static void Delete_the_target_element(int[] arr, int target) {
        int n = arr.length;
        int[] newArray = new int[n - 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int curVal = arr[i];
            if (curVal != target) {
                newArray[idx++] = curVal;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
