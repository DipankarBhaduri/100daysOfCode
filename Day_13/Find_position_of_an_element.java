package Day_13;

import java.util.*;

public class Find_position_of_an_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        sc.close();
        int ans = Find_position(arr, target);
        System.out.print(ans);

    }

    public static int Find_position(int[] arr, int target) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
