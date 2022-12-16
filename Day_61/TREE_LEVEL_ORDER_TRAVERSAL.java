package Day_61;

import java.util.*;

public class TREE_LEVEL_ORDER_TRAVERSAL {
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

    static class BinaryTree {

        public Node buildTree(int nodes, Node root) {
            Node newNode = new Node(nodes);

            if (root == null) {
                root = newNode;
            }
            if (nodes > root.data) {
                root.right = buildTree(nodes, root.right);
            } else if (nodes < root.data) {
                root.left = buildTree(nodes, root.left);
            }

            return root;
        }
    }

    static ArrayList<Integer> levelOrder_L(Node node) {
        ArrayList<Integer> ar = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        Node curr = node;
        q.add(curr);

        while (!q.isEmpty() && curr != null) {
            curr = q.poll();
            ar.add(curr.data);
            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }

        return ar;
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 5, 3, 4, 6 };
        BinaryTree tree = new BinaryTree();
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = tree.buildTree(nodes[i], root);
        }
        ArrayList<Integer> list = levelOrder_L(root);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
