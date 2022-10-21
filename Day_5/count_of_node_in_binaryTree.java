package Day_5;

public class count_of_node_in_binaryTree {
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

    public static int count_of_node(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = count_of_node(root.left);
        int rightCount = count_of_node(root.right);
        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = tree.buildTree(node);
        int count = count_of_node(root);
        System.out.print("Total number of Nodes in this tree is : " + count);
    }
}
