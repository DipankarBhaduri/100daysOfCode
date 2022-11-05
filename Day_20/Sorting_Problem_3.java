package Day_20;

import java.util.*;

public class Sorting_Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp * temp;
        }

        sc.close();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
