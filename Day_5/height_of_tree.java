package Day_5;

import Day_4.buildTree_preOrder_Sequence;

public class height_of_tree {
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

    public static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] node) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }
    }

    public static int height_the_tree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftTreeHeight = height_the_tree(root.left);
        int rightTreeHeight = height_the_tree(root.right);

        int maxHeight = Math.max(leftTreeHeight, rightTreeHeight) + 1;
        return maxHeight;
    }

    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = tree1.buildTree(node);
        int height = height_the_tree(root);
        System.out.print("Max height of the tree is : " + height);
    }
}
