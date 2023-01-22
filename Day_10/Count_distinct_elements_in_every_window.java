/*

7 4
1 2 1 3 4 2 3
ans -->>  3 4 4 3
*/
package Day_10;

import java.util.*;

public class Count_distinct_elements_in_every_window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int windowSize = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        countDistinctElements(arr, windowSize);
    }

    public static void countDistinctElements(int[] arr, int windowSize) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < windowSize; i++) {
            if (map.containsKey(arr[i])) {
                int value = map.get(arr[i]);
                map.put(arr[i], value + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.print(map.size() + " ");

        for (int i = windowSize; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int value = map.get(arr[i]);
                map.put(arr[i], value + 1);
            } else {
                map.put(arr[i], 1);
            }

            int val = map.get(arr[i - windowSize]); // 1 2 1 3 4 2 3
            if (val == 1) {
                map.remove(arr[i - windowSize]);
            } else {
                map.put(arr[i - windowSize], val - 1);
            }

            System.out.print(map.size() + " ");
        }

    }
}
