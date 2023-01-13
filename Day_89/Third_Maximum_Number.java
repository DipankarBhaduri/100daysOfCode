package Day_89;

import java.util.*;

public class Third_Maximum_Number {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        int[] nums = { 1, 1, 2 };
        int ans = s3.thirdMax(nums);
        System.out.println(ans);
    }
}

class Solution3 {
    public int thirdMax(int[] nums) {
        int fst = Integer.MIN_VALUE;
        int snd = Integer.MIN_VALUE;
        int thrd = Integer.MIN_VALUE;

        Arrays.sort(nums);
        if (nums.length < 3) {
            return nums[nums.length - 1];
        }
        fst = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            int val = nums[i];
            if (val < fst) {
                if (val > snd) {
                    snd = val;
                }

                if (val < snd && val >= thrd) {
                    thrd = val;
                    return val;
                }
            }
        }

        if (thrd != Integer.MIN_VALUE) {
            return thrd;
        } else {
            return fst;
        }
    }
}