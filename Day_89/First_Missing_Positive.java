package Day_89;

import java.util.HashSet;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] nums = { 3, 4, -1, 1 };
        Solution1 s1 = new Solution1();
        int ans = s1.firstMissingPositive(nums);
        System.out.println(ans);
    }
}

class Solution1 {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }

        int missingNumber = 0;
        int i = 1;
        while (i <= nums.length + 1) {
            if (!set.contains(i)) {
                missingNumber = i;
                break;
            }

            i++;
        }

        return missingNumber;
    }
}