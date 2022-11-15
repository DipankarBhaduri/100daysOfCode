package Day_30;

import java.util.*;

public class Least_Greater_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        find_next_greater_element(arr);
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void find_next_greater_element(int[] arr) {
        int[] newArr = new int[arr.length];
        int idx = 0;
        newArr[arr.length - 1] = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int put = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    put = arr[j];
                    break;
                }
            }
            newArr[idx] = put;
            idx++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
    }
}
