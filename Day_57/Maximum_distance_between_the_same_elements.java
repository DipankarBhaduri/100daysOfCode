package Day_57;

import java.util.*;

public class Maximum_distance_between_the_same_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = Maximum_distance_between_two_same_element(arr);
        System.out.print(ans);
    }

    static int Maximum_distance_between_two_same_element(int[] arr) {
        int n = arr.length;
        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    int temp = j - i;
                    max = Math.max(max, temp);
                }
            }
        }

        return max;

    }
}
