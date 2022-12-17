package Day_62_recursion;

/*

Given an array of ints, compute recursively if the array contains somewhere a 
value followed in the array by that value times 10. We'll use the convention 
of considering only the part of the array that begins at the given index. 
In this way, a recursive call can pass index+1 to move down the array. 
The initial call will pass in index as 0.


array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false

 */
import java.util.*;

public class array220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        boolean b = array220(arr, 0);
        System.out.println(b);
    }

    public static boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return false;
        }

        if (nums.length < 2) {
            return false;
        }

        if (nums[index] * 10 == nums[index + 1]) {
            return true;
        } else {
            return array220(nums, index + 1);
        }

    }
}
