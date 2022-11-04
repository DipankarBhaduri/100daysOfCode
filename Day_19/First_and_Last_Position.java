package Day_19;

import java.util.*;

public class First_and_Last_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int st = first_position(arr, target);
        int last = last_position(arr, target);
        System.out.print(st + " " + last);
    }

    public static int first_position(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int last_position(int[] arr, int target) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
