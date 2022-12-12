package Day_57;

import java.util.*;

public class Check_if_two_arrays_are_equal_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        boolean ans = check_arrays_are_equal_or_not(arr1, arr2);
        System.out.print(ans);

    }

    static boolean check_arrays_are_equal_or_not(int[] arr1, int[] arr2) {
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
            } else {
                return false;
            }
        }

        if (map.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
