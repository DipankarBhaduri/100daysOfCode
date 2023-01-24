package Day_100;

import java.util.Arrays;

public class Convert_an_array_to_reduced_form {
    public static void main(String[] args) {

    }
}

class Solution {
    void convert(int[] arr, int n) {
        int temp[] = arr.clone();
        Arrays.sort(temp);
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = binary(temp, arr[i]);
        }
    }

    public static int binary(int[] temp, int key) {
        int i = 0;
        int j = temp.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (temp[mid] == key) {
                return mid;
            } else if (temp[mid] > key) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}