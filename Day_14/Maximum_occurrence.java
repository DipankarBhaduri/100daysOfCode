package Day_14;

import java.util.*;

public class Maximum_occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = maximum_occurrencess(arr, map);
        System.out.print(ans);
    }

    public static int maximum_occurrencess(int[] arr, HashMap<Integer, Integer> map) {
        int n = arr.length;

        if (n == 1) {
            return arr[0];
        }
        if (n == 2) {
            if (arr[0] < arr[1]) {
                return arr[0];
            } else if (arr[0] > arr[1]) {
                return arr[1];
            } else {
                return arr[0];
            }
        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put(arr[i], val + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxval = 0;
        int maxkey = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {

            if (e.getValue() > maxval) {
                maxval = e.getValue();
                maxkey = e.getKey();
            } else if (e.getValue() == maxval) {
                if (maxkey > e.getKey()) {
                    maxkey = e.getKey();
                }
            }
        }
        return maxkey;
    }
}
