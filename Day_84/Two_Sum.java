package Day_84;

import java.util.*;

public class Two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        HashMap<Integer, Integer> set = new HashMap<>();
        int n = nums.length;
        int index = 0;
        while (index < n) {
            int value = nums[index];
            if (set.containsKey(target - value)) {
                int curr = set.get(target - value);
                arr[0] = curr;
                arr[1] = index;
                return arr;

            } else {
                set.put(nums[index], index);
            }
            index++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result = twoSum(arr1, target1);
        System.out.print("The addtion of index " + result[0] + " & " + result[1] + " the target will be found");
    }
}
