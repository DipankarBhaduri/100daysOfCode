package Day_55;

import java.util.*;

public class Check_Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        System.out.print(check_subset_or_not(arr1, m, arr2, n));
    }

    static boolean check_subset_or_not(int[] arr1, int m, int[] arr2, int n) {
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

        for (int i = 0; i < n; i++) {
            int val = arr2[i];
            if (map.containsKey(val)) {
                int value = map.get(val);
                if (value == 1) {
                    map.remove(val);
                } else {
                    map.put(val, value - 1);
                }

            } else {
                return false;
            }
        }

        return true;

    }
}
