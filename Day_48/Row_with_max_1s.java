package Day_48;

import java.util.*;

public class Row_with_max_1s {
    public static void main(String[] args) {

    }
}

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int oneCount = 0;
            for (int j = 0; j < m; j++) {
                int temp = arr[i][j];
                if (temp == 1) {
                    oneCount++;
                }
            }

            map.put(i, oneCount);
        }

        int maxOne = 0;
        int maxOneRow = -1;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > maxOne) {
                maxOne = e.getValue();
                maxOneRow = e.getKey();
            }
        }

        return maxOneRow;
    }
}