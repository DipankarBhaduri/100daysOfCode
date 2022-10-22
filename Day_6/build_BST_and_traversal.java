package Day_6;

public class build_BST_and_traversal {

    // Here is Node class And Constractor :->>
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Here is the new Value inseration process into the BST :->>
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

    // Here printing the value inorder fashion :->>
    public static void inOrder_traversal(Node root) {
        if (root == null) {
            return;
        }

        inOrder_traversal(root.left);
        System.out.print(root.data + " ");
        inOrder_traversal(root.right);

    }

    // this is my main function:->>
    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        // Every time one one element puting into the loop for inserting into the tree
        // :->>
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder_traversal(root);

    }
}
