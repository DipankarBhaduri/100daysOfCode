package Day_49;

import java.util.*;

public class Find_Pair_Given_Difference {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean findPair(int arr[], int size, int n) {
        if (n == 0) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int x : arr) {
                if (map.containsKey(x)) {
                    int temp = map.get(x);
                    map.put(x, temp + 1);
                } else {
                    map.put(x, 1);
                }
            }

            boolean flag = false;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() == 2) {
                    flag = true;
                }
            }

            if (flag == true) {
                return true;
            } else {
                return false;
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        for (int i = 0; i < size; i++) {
            int temp = arr[i];

            if (set.contains(n + temp)) {
                return true;
            }
        }
        return false;
    }
}
