package Day_89;

public class Reverse_Integer {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(120));
    }
}

class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = (result * 10) + (x % 10);
            if (result > Integer.MAX_VALUE)
                return 0;
            if (result < Integer.MIN_VALUE)
                return 0;
            x = x / 10;
        }
        return (int) result;
    }
}