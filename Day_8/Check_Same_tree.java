package Day_8;

/*
Given two root nodes of two separate binary trees, check whether the trees are identical.

Two binary trees are considered the same if they have identical shapes, and the corresponding nodes have the same value.
 */
public class Check_Same_tree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void areTreesIdentical(Node root1, Node root2) {
        if (helper(root1, root2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    public static boolean helper(Node a, Node b) {
        if (a == null && b == null)
            return true;

        /* 2. both non-empty -> compare them */
        if (a != null && b != null)
            return (a.data == b.data
                    && helper(a.left, b.left)
                    && helper(a.right, b.right));

        /* 3. one empty, one not -> false */
        return false;
    }
}