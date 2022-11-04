package Day_19;

import java.util.*;

public class Split_The_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(split_array(arr));
        }
        sc.close();
    }

    public static String split_array(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            if (map.containsKey(val)) {
                int value = map.get(val);
                map.put(val, value + 1);
            } else {
                map.put(val, 1);
            }
        }

        int count = map.get(arr[0]);

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() != count) {
                return "NO";
            }
        }

        return "YES";
    }
}
