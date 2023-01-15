package Day_91;

public class Sum_Tree {
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

    static class buildTree {
        static int index = -1;

        static Node BinaryTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = BinaryTree(nodes);
            newNode.right = BinaryTree(nodes);
            return newNode;
        }
    }

    static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + "->>");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        int[] nodes = { 10, 20, 10, -1, -1, 10, -1, -1, 30, -1, -1 };
        Node root = null;

        buildTree BT = new buildTree();
        root = BT.BinaryTree(nodes);

        inOrderTraversal(root);
    }
}
