package Day_73;

import java.util.*;

public class Largest_subtree_sum_in_a_tree {
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

    static class Binary_Tree {
        static int index = -1;

        Node Build_Tree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = Build_Tree(nodes);
            newNode.right = Build_Tree(nodes);

            return newNode;
        }
    }

    static void inOrder_Traversal(Node root) {
        if (root == null) {
            return;
        }

        inOrder_Traversal(root.left);
        System.out.print(root.data + " ");
        inOrder_Traversal(root.right);
    }

    static int ans = Integer.MIN_VALUE;

    private static int rec(Node root) {
        if (root == null) {
            return 0;
        }

        int left_tree = rec(root.left);
        int right_tree = rec(root.right);
        int include = root.data + left_tree + right_tree;
        ans = Math.max(ans, include);
        return include;
    }

    public static int findLargestSubtreeSum(Node root) {
        ans = Integer.MIN_VALUE;
        rec(root);
        return ans;
    }

    // level Order traversal :-->>
    static void level_Order_Traversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    System.out.println();
                    q.add(null);
                }
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, -2, 4, -1, -1, 5, -1, -1, 3, -6, -1, -1, 2, -1, -1 };
        Binary_Tree tree = new Binary_Tree();
        Node root = null;
        root = tree.Build_Tree(nodes);
        System.out.println(root.data);

        // Inoder Traversal :-->>
        System.out.print("The inOder Traversal results : ");
        inOrder_Traversal(root);

        int ans = findLargestSubtreeSum(root);
        System.out.print(ans);

        // Level_Order Traversal :-->>
        System.out.println();
        level_Order_Traversal(root);

    }
}