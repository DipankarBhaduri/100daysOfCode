package Day_5;

import Day_4.buildTree_preOrder_Sequence;

public class Diameter_of_a_tree_TC_On2 {
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

    public static int height_of_tree1(Node root) {

        if (root == null) {
            return 0;
        }

        int leftside_height = height_of_tree1(root.left);
        int rightside_height = height_of_tree1(root.right);
        int maxHeight = Math.max(leftside_height, rightside_height) + 1;
        return maxHeight;
    }

    public static int diameter_of_tree(Node root) {
        if (root == null) {
            return 0;
        }

        int dia_1 = diameter_of_tree(root.left);
        int dia_2 = diameter_of_tree(root.right);
        int dia_3 = height_of_tree1(root.left) + height_of_tree1(root.right) + 1;
        int max_dia = Math.max(dia_1, Math.max(dia_2, dia_3));
        return max_dia;
    }

    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = tree1.buildTree(node);
        int ans = diameter_of_tree(root);
        System.out.print("Max diameter of this tree is : " + ans);

    }
}
