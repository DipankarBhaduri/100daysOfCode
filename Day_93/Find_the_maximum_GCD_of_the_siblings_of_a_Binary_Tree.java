package Day_93;

public class Find_the_maximum_GCD_of_the_siblings_of_a_Binary_Tree {
    public static void main(String[] args) {

    }
}

class Solution {
    int ans = 0, MaxGCD = 0;

    public int findGCD(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return findGCD(a - b, b);
        return findGCD(a, b - a);
    }

    public void fun(Node root) {
        if (root == null)
            return;
        fun(root.left);
        fun(root.right);
        if (root.left != null && root.right != null) {
            int gcd = findGCD(root.left.data, root.right.data);
            if (gcd > MaxGCD) {
                ans = root.data;
                MaxGCD = gcd;
            }
        }
    }

    int maxGCD(Node root) {
        fun(root);
        return ans;
    }
}