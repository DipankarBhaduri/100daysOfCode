package Day_86;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Solution s = new Solution();
        int ans = s.maxSubArray(nums);
        System.out.print(ans);
    }
}

class Solution {
    int maxSubArray(int[] nums) {
        int max = 0;
        int local1 = 0;
        for (int i = 0; i < nums.length; i++) {
            local1 += nums[i];
            if (local1 < 0) {
                local1 = 0;
            } else {
                max = Math.max(max, local1);
            }
        }
        return max;
    }
}