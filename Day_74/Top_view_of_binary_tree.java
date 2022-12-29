package Day_74;

import java.util.*;
import java.util.LinkedList;

public class Top_view_of_binary_tree {

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

    static class Binary_Tree {
        static int index = -1;

        static Node BuildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    static void inOrder_Traversal(Node root) {
        if (root == null) {
            return;
        }

        inOrder_Traversal(root.left);
        System.out.print(root.data + " ");
        inOrder_Traversal(root.right);
    }

    static void level_Order(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    System.out.println();
                    q.add(null);
                }
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    static class info {
        Node node;
        int hd;

        info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    static void Top_view(Node root) {
        Queue<info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;

        q.add(new info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            info curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {

                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = null;
        Binary_Tree tree = new Binary_Tree();
        root = tree.BuildTree(nodes);
        // System.out.println(root.data + " <---ROOT------<<");

        // // inOrder Traversal :--->>
        // inOrder_Traversal(root);

        // // LevelOrder Traversal :-->>
        // level_Order(root);

        // Top view of the tree :-->>
        Top_view(root);
    }
}
