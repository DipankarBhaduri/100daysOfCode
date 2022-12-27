package Day_72;

public class Binary_Tree_Problems {

    // Node class :-->>
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

    // BuildTree Class :-->>
    static class Binary_Tree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // inOrder Traversal :-->>
    public static void inOrder_traversal(Node root) {
        if (root == null) {
            return;
        }

        inOrder_traversal(root.left);
        System.out.print(root.data + " ");
        inOrder_traversal(root.right);
    }

    // Main functions :-->>
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binary_Tree tree = new Binary_Tree();
        Node root = tree.buildTree(nodes);

        // InOrder Traversal in binary tree :-->>
        System.out.print("The inOrder Traversal result : ");
        inOrder_traversal(root);

    }
}
