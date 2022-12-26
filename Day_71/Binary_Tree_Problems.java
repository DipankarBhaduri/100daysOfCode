package Day_71;

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

    // BuildTree Functions :-->>
    static class Binary_Tree {
        static int idx = -1;

        static Node buildTree(int[] nodes) {
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

    // Main Functions :-->>
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, 7, -1, -1, 8, -1, -1, 5, -1, -1, 3, -1, 6, -1, 9, -1, -1 };
        Binary_Tree tree = new Binary_Tree();
        Node root = tree.buildTree(nodes);
        System.out.print(root.data);
    }

}
