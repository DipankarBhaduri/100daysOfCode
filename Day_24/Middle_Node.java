package Day_24;

import java.util.*;

public class Middle_Node {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        middle_element(arr);
    }

    public static void middle_element(int[] arr) {
        int n = arr.length;
        if (n % 2 == 0) {
            for (int i = (n / 2); i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = (n / 2); i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
