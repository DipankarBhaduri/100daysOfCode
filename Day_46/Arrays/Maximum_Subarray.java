package Arrays;

/*
Given an integer array nums, find the 
subarray which has the largest sum and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23

 */
class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = 0;
        int largestSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            largestSum = Math.max(largestSum, curSum);

            if (curSum < 0) {
                curSum = 0;
            }
        }

        return largestSum;
    }
}