package Day_48;

import java.util.*;

public class Merge_Without_Extra_Spac {
    public static void main(String[] args) {

    }
}

class Solution {
    // Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) {
        long[] arr = new long[m + n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            arr[idx++] = arr1[i];
        }

        for (int i = 0; i < m; i++) {
            arr[idx++] = arr2[i];
        }

        Arrays.sort(arr);
        int index = n;
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = arr[index++];
        }

    }
}
