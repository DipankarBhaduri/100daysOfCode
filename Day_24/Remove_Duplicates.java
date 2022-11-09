package Day_24;

import java.util.*;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        remove_duplicates_element(arr);
    }

    public static void remove_duplicates_element(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int value = arr[i];
            set.add(value);
        }

        for (int i = 0; i < n; i++) {
            int value = arr[i];
            if (set.size() > 0 && set.contains(value)) {
                System.out.print(value + " ");
                set.remove(value);
            }
        }
    }
}
