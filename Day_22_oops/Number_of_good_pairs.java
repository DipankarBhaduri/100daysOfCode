package Day_22_oops;

import java.util.*;

public class Number_of_good_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length_of_arr = sc.nextInt();
        int[] arr = new int[length_of_arr];

        for (int i = 0; i < length_of_arr; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int number_of_good_pair = calculate_the_number_of_good_pair(arr);
        System.out.print(number_of_good_pair);
    }

    static int calculate_the_number_of_good_pair(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int value = map.get(arr[i]);
                map.put(arr[i], value + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int countGoodPair = 0;

        for (int curElement : arr) {
            int value = map.get(curElement);
            if (value > 1) {
                map.put(curElement, value - 1);
                countGoodPair += value - 1;
            } else {
                map.remove(curElement);
            }
        }

        return countGoodPair;
    }
}
