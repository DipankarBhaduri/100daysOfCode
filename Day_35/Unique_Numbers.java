package Day_35;

import java.util.*;

public class Unique_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = unique_number_sum(arr);
            System.out.println(ans);
        }
        sc.close();
    }

    public static int unique_number_sum(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            if (map.containsKey(val)) {
                int value = map.get(val);
                map.put(val, value + 1);
            } else {
                map.put(val, 1);
            }
        }

        int sum = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                sum += e.getKey();
            }
        }

        return sum;
    }
}
