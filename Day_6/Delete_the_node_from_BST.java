package Day_6;

public class Delete_the_node_from_BST {
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

    public static Node build_BST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = build_BST(root.left, val);
        } else {
            root.right = build_BST(root.right, val);
        }
        return root;
    }

    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }

        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public static Node Delete_node(Node root, int val) {
        if (root.data > val) {
            root.left = Delete_node(root.left, val);
        } else if (root.data < val) {
            root.right = Delete_node(root.right, val);
        } else {

            // 1st case where node is leaf node ;
            if (root.left == null && root.right == null) {
                return null;
            }

            // 2nd case where node having single child ;
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // 3rd case where node having two child ;
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = Delete_node(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = build_BST(root, values[i]);
        }

        InOrder(root);
        System.out.println();

        Delete_node(root, 6);
        InOrder(root);
        System.out.println();

    }
}
