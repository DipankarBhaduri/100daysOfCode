package Day_17;

import java.util.*;

public class Array_Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        int ver1 = 0;
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
            ver1 += arr1[i];
        }

        int ver2 = 0;
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
            ver2 += arr2[i];
        }
        sc.close();

        if (ver1 == ver2) {
            System.out.print("Both are equal");
        } else if (ver1 > ver2) {
            System.out.print("First array is larger");
        } else {
            System.out.print("Second array is larger");
        }
    }
}
