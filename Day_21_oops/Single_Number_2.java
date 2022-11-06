package Day_21_oops;

import java.util.*;

public class Single_Number_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            sc.close();
            print_single_number(arr);
            System.out.println();
        }
    }

    public static void print_single_number(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            if (map.containsKey(val)) {
                int value = map.get(val);
                map.put(val, value + 1);
            } else {
                map.put(val, 1);
            }
        }

        int[] result = new int[2];
        int idx = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                result[idx++] = e.getKey();
            }
        }

        Arrays.sort(result);
        System.out.print(result[0] + " " + result[1]);
    }
}
