package Day_52;

import java.util.*;

public class First_and_Last_Position_of_an_Element_In_Sorted_Array {
    public static void main(String[] args) {

    }
}

class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                ans[0] = i;
                break;
            }
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) == k) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }

};