package Day_11;

import java.util.*;

public class Index_of_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        index_of_ele(arr, target);

    }

    public static void index_of_ele(int[] arr, int target) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
                System.out.print(i + " ");
            }
        }
        if (count == 0) {
            System.out.print(-1);
        }
    }
}
