package Day_65;

import java.util.*;

public class Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        perfrom_Intersection_Of_Two_Arrays(arr1, arr2, n1, n2);

    }

    static void perfrom_Intersection_Of_Two_Arrays(int[] arr1, int[] arr2, int n1, int n2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            if (map.containsKey(arr1[i])) {
                int value = map.get(arr1[i]);
                map.put(arr1[i], value + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n2; i++) {
            if (map.containsKey(arr2[i])) {
                list.add(arr2[i]);
                int value = map.get(arr2[i]);
                if (value == 1) {
                    map.remove(arr2[i]);
                } else {
                    map.put(arr2[i], value - 1);
                }
            }
        }

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
