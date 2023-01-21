package Day_97;

public class Minimum_X_xor_A {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int minVal(int a, int b) {
        // code here
        int x = Integer.bitCount(a);
        int y = Integer.bitCount(b);
        int min = Integer.MAX_VALUE;
        if (x == y)
            return a;
        else if (x > y) {
            for (int i = a; i > 0; i--) {
                min = Math.min(min, i ^ a);
                if (Integer.bitCount(i) == y)
                    return i;
            }
        } else if (y > x) {
            for (int i = a; i < Integer.MAX_VALUE; i++) {
                min = Math.min(min, i ^ b);
                if (Integer.bitCount(i) == y)
                    return i;
            }
        }
        return 0;
    }
}