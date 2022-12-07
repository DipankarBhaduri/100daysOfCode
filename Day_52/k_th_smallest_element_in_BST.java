package Day_52;

public class k_th_smallest_element_in_BST {

}

class Solution {
    public int KthSmallestElement(Node root, int K) {
        // Write your code here
        ans = -1;
        kth = K;
        f(root);
        return ans;
    }

    public static int ans, kth;

    public static void f(Node root) {
        if (root == null || kth <= 0)
            return;
        f(root.left);
        if (kth == 1) {
            ans = root.data;
        }
        kth--;
        f(root.right);
    }
}