package Day_6;

public class Search_the_key_in_BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) {
            return Search(root.left, key);
        } else if (root.data < key) {
            return Search(root.right, key);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        int key = 15;

        if (Search(root, key)) {
            System.out.print("found");
        } else {
            System.out.print("Not found");
        }

    }
}
