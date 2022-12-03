package Day_48;

import java.util.*;

public class Find_triplets_with_zero_sum {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean findTriplets(int arr[], int n) {
        Arrays.sort(arr);
        if (n == 3) {
            int sum = arr[0] + arr[1] + arr[2];
            if (sum == 0) {
                return true;
            } else {
                return false;
            }
        }

        for (int i = 0; i < (n - 2); i++) {
            int fst = arr[i];
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int nd = arr[start];
                int rd = arr[end];

                if ((fst + nd + rd) == 0) {
                    return true;
                } else if ((fst + nd + rd) >= 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return false;
    }
}
