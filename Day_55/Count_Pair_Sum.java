package Day_55;

import java.util.*;

public class Count_Pair_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        int target = sc.nextInt();
        int ans = perfrom_count_pair_sum(arr1, m, arr2, n, target);
        System.out.print(ans);
    }

    static int perfrom_count_pair_sum(int[] arr1, int m, int[] arr2, int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int val = arr1[i];
            if (map.containsKey(val)) {
                int value = map.get(val);
                map.put(val, value + 1);
            } else {
                map.put(val, 1);
            }
        }

        int counter = 0;

        for (int i = 0; i < n; i++) {
            int val = arr2[i];
            if (map.containsKey(target - val)) {
                int value = map.get(target - val);
                counter += value;
            }
        }

        return counter;
    }
}
