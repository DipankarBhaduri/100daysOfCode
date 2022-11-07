package Day_22_oops;

import java.util.*;

public class Relative_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L1 = sc.nextInt();
        int L2 = sc.nextInt();
        int[] arr1 = new int[L1];
        int[] arr2 = new int[L2];
        for (int i = 0; i < L1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < L2; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        print_the_relative_shorting(arr1, arr2);
    }

    static void print_the_relative_shorting(int[] arr1, int[] arr2) {
        int n1 = arr1.length;

        int[] newArray = new int[n1];
        int idx = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr1) {
            if (map.containsKey(val)) {
                int temp = map.get(val);
                map.put(val, temp + 1);
            } else {
                map.put(val, 1);
            }
        }

        for (int val : arr2) {
            if (map.containsKey(val)) {
                int fre = map.get(val);
                for (int i = 0; i < fre; i++) {
                    newArray[idx++] = val;
                }
                map.remove(val);
            }
        }

        Arrays.sort(arr1);

        for (int val : arr1) {
            if (map.containsKey(val)) {
                int fre = map.get(val);
                for (int i = 0; i < fre; i++) {
                    newArray[idx++] = val;
                }
                map.remove(val);
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
