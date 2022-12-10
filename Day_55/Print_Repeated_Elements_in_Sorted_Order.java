package Day_55;

import java.util.*;

public class Print_Repeated_Elements_in_Sorted_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        print_repeated_in_sorted_order(arr);
    }

    static void print_repeated_in_sorted_order(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (map.containsKey(val)) {
                int value = map.get(val);
                if (value == 1) {
                    list.add(val);
                }
                map.put(val, value + 1);
            } else {
                map.put(val, 1);
            }
        }
        Collections.sort(list);
        if (list.size() == 0) {
            System.out.print(-1);
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
