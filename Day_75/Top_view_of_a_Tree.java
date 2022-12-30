package Day_75;

import java.util.*;

public class Top_view_of_a_Tree {

    // Static Node class :-->>
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

    // Binary Tree class :-->>
    static class Binary_Tree {
        static int index = -1;

        // Build Tree function :-->>
        Node BuildTree(int[] nodes) {
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

    // Info class as helper for top view :-->>
    static class info {
        int hd;
        Node node;

        info(Node node, int hd) {
            this.hd = hd;
            this.node = node;
        }
    }

    // Top view functions :-->>
    static ArrayList<Integer> Top_view_of_the_tree(Node root) {
        Queue<info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        q.add(new info(root, 0));
        q.add(null);
        int min = 0;
        int max = 0;

        while (!q.isEmpty()) {
            info cur = q.remove();
            if (cur == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                if (!map.containsKey(cur.hd)) {
                    map.put(cur.hd, cur.node);
                }

                if (cur.node.left != null) {
                    q.add(new info(cur.node.left, cur.hd - 1));
                    min = Math.min(min, cur.hd - 1);
                }
                if (cur.node.right != null) {
                    q.add(new info(cur.node.right, cur.hd + 1));
                    max = Math.max(cur.hd + 1, max);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            list.add(map.get(i).data);
        }

        return list;
    }

    // Main functions :-->>
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // Creating object of the binary tree :-->>
        Binary_Tree tree = new Binary_Tree();
        Node root = tree.BuildTree(nodes);
        // // Root data printing :-->>
        // System.out.print(root.data + " ");

        // Top view function calling :-->>
        ArrayList<Integer> list = Top_view_of_the_tree(root);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
