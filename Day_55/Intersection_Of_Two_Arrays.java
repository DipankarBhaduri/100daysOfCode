package Day_55;

import java.util.*;

public class Intersection_Of_Two_Arrays {
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
        print_common_from_two_array(arr1, m, arr2, n);
    }

    static void print_common_from_two_array(int[] arr1, int m, int[] arr2, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int val = arr1[i];
            if (map.containsKey(val)) {
                int temp = map.get(val);
                map.put(val, temp + 1);
            } else {
                map.put(val, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int val = arr2[i];
            if (map.containsKey(val)) {
                int value = map.get(val);
                if (value == 1) {
                    map.remove(val);

                    list.add(val);
                } else {
                    map.put(val, value - 1);

                    list.add(val);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
