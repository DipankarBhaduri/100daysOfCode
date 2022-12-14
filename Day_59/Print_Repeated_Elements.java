package Day_59;

import java.util.*;

public class Print_Repeated_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        ArrayList<Integer> list = find_repeated_element_in_sorted_order(arr);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    static ArrayList<Integer> find_repeated_element_in_sorted_order(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length < 2) {
            return list;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    set.add(arr[i]);
                    break;
                }
            }
        }

        for (int val : set) {
            list.add(val);
        }

        return list;
    }
}