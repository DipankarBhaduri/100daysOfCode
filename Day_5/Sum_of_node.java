package Day_5;

import Day_4.buildTree_preOrder_Sequence;

public class Sum_of_node {
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

    public static int Sum_all_node(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = Sum_all_node(root.left);
        int rightsum = Sum_all_node(root.right);
        return leftsum + rightsum + root.data;

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] node = { 12, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = tree.buildTree(node);
        int sum = Sum_all_node(root);
        System.out.print("The sum of all node is : " + sum);
    }
}
