package Day_75;

import java.util.*;

public class Right_view_of_a_binary_tree {
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
        static int index = -1;

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

    static ArrayList<Integer> Right_view(Node root) {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        q.add(root);
        q.add(null);
        Node temp = null;
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                list.add(temp.data);
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                temp = curr;
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, 99, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        // System.out.print(root.data) ;

        ArrayList<Integer> list = Right_view(root);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
