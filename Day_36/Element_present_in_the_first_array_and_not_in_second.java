package Day_36;

import java.util.*;

public class Element_present_in_the_first_array_and_not_in_second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr1[] = new int[m];
        int arr2[] = new int[n];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        Element_present_in_first_array_but_not_present_inthe_second(arr1, m, arr2, n);
    }

    public static void Element_present_in_first_array_but_not_present_inthe_second(int[] arr1, int m, int[] arr2,
            int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr1) {
            if (map.containsKey(val)) {
                int value = map.get(val);
                map.put(val, value + 1);
            } else {
                map.put(val, 1);
            }
        }

        for (int val : arr2) {
            if (map.containsKey(val)) {
                int value = map.get(val);
                if (value == 1) {
                    map.remove(val);
                } else {
                    map.put(val, value - 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + " ");
        }
    }
}
