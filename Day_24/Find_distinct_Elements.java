package Day_24;

import java.util.*;

public class Find_distinct_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
        int count_of_distinct = find_distinct(arr, n);
        System.out.print(count_of_distinct);
    }

    public static int find_distinct(int[][] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int curElement = arr[i][j];
                if (i == 0) {
                    map.put(curElement, i + 1);
                } else if (map.containsKey(curElement)) {
                    map.put(curElement, i + 1);
                }
            }
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if ((e.getValue()) != (i + 1)) {
                    int key1 = e.getKey();
                    map.remove(key1);
                }
            }
        }
        return map.size();
    }
}
