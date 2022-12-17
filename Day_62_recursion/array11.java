package Day_62_recursion;
/*
Given an array of ints, compute recursively the number of times that 
the value 11 appears in the array. We'll use the convention of 
considering only the part of the array that begins at the given index. 
In this way, a recursive call can pass index+1 to move down the array. 
The initial call will pass in index as 0.


array11([1, 2, 11], 0) → 1
array11([11, 11], 0) → 2
array11([1, 2, 3, 4], 0) → 0
 */

import java.util.*;

public class array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int b = array11(arr, 0);
        System.out.println(b);
    }

    public static int array11(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }

        if (nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        } else {
            return array11(nums, index + 1);
        }

    }
}
