package Day_52;

import java.util.*;

public class Find_Duplicate_in_Array {
    public static void main(String[] args) {

    }
}

class Solution1 {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            if (set.contains(val)) {
                return val;
            } else {
                set.add(val);
            }
        }

        return -1;
    }
}
