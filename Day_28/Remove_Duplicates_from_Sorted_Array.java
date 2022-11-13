package Day_28;
import java.util.*;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = removeDuplicates(arr);
        System.out.print(ans);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int idx = 0;
        for (int val : nums) {
            if (set.contains(val)) {
                nums[idx++] = val;
                set.remove(val);
            }
        }
        return idx;
    }
}
