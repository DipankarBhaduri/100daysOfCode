package Day_19;

import java.util.*;

public class Find_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        find_element(arr, target);
    }

    public static void find_element(int[] arr, int target) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.print(i + " ");
                count++;
            }
        }

        if (count == 0) {
            System.out.print("NOT FOUND");
        }
    }
}
