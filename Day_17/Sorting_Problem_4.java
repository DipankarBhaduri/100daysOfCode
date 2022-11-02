package Day_17;

import java.util.*;

public class Sorting_Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print(majority_element(arr));
    }

    public static int majority_element(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int frequency = map.get(arr[i]);
                map.put(arr[i], frequency + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            int value = map.get(arr[i]);
            if (value > (n / 2)) {
                return arr[i];
            }
        }
        return -1;
    }
}
