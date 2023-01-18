package Day_94;

public class Students_Performance {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 4, 18 };
        Solution s = new Solution();
        int[] ans = s.solve(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    public int[] solve(int[] arr) {
        // Your code here
        int[] ans = new int[arr.length];
        ans[0] = -1;

        for (int i = 1; i < arr.length; i++) {
            int value = -1;
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    value = i - j;
                }
            }
            ans[i] = value;
        }

        return ans;
    }
}