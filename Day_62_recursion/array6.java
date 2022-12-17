package Day_62_recursion;

import java.util.*;

/*

Given an array of ints, compute recursively if the array contains a 6. 
We'll use the convention of considering only the part of the array that 
begins at the given index. In this way, a recursive call can pass 
index+1 to move down the array. The initial call will pass in index as 0.


array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true

 */
public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        boolean b = array6(arr, 0);
        System.out.println(b);

    }

    public static boolean array6(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        }

        if (nums[index] == 6) {
            return true;
        } else {
            return array6(nums, index + 1);
        }
    }
}
