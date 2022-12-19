/*
 * 4 3 3
 * 1 4 5 6
 * 3 4 5
 * 5 6 7
 * 
 */

package Day_63;

import java.util.*;

public class Common_Elements_In_Three_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n3];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }
        sc.close();
        Common_Elements_In_Three_Sorted_Arrays(arr1, arr2, arr3, n1, n2, n3);
    }

    static void Common_Elements_In_Three_Sorted_Arrays(int[] arr1, int[] arr2, int[] arr3, int n1, int n2,
            int n3) {

        HashSet<Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            map1.add(arr1[i]);
        }

        for (int j = 0; j < n2; j++) {
            map2.add(arr2[j]);
        }

        for (int k = 0; k < n3; k++) {
            int val = arr3[k];
            if (map1.contains(val) && map2.contains(val)) {
                System.out.print(val + " ");
                map1.remove(val);
                map2.remove(val);
            }
        }
    }
}