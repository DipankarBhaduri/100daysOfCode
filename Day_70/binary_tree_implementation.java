package Day_70;

import java.util.*;

public class binary_tree_implementation {

    // Node class in Binary tree :-->>
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

    // Build_Tree in Binary tree :-->>
    static class Binary_Tree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
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

    // Print the node in preOrder sequence :-->>
    static void preOrder_traversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder_traversal(root.left);
        preOrder_traversal(root.right);
    }

    // Print the node in postOrder sequence :-->>
    static void postOrder_traversal(Node root) {
        if (root == null) {
            return;
        }

        postOrder_traversal(root.left);
        postOrder_traversal(root.right);
        System.out.print(root.data + " ");
    }

    // Print the node in inOrder sequence :-->>
    static void inOrder_traversal(Node root) {
        if (root == null) {
            return;
        }

        inOrder_traversal(root.left);
        System.out.print(root.data + " ");
        inOrder_traversal(root.right);
    }

    // Print the level Order Traversal result line by line wise :-->>
    static void level_Order_traversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node newNode = q.remove();
            if (newNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(newNode.data + " ");
                if (newNode.left != null) {
                    q.add(newNode.left);
                }

                if (newNode.right != null) {
                    q.add(newNode.right);
                }
            }
        }
    }

    // Print the level Order Traversal result in single line :-->>
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node newNode = q.remove();
            System.out.print(newNode.data + " ");
            if (newNode.left != null) {
                q.add(newNode.left);
            }

            if (newNode.right != null) {
                q.add(newNode.right);
            }
        }
    }

    // count Node in the binary tree :-->>
    public static int count_Node(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + count_Node(root.left) + count_Node(root.right);
        }
    }

    // sum of the nodes value :-->>
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        } else {
            return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
        }
    }

    // Height of the tree :-->>
    public static int height_of_the_tree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height_of_the_tree(root.left);
        int rightHeight = height_of_the_tree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Two sum in Binary tree :-->
    public static Boolean two_sum(Node root, int key) {
        HashSet<Integer> set = new HashSet<>();
        return helper_of_two_sum(root, key, set);
    }

    // helper function for two sum binary tree :-->>
    static boolean helper_of_two_sum(Node root, int key, HashSet<Integer> set) {
        if (root == null) {
            return false;
        }
        if (set.contains(key - root.data)) {
            return true;
        }
        set.add(root.data);
        return helper_of_two_sum(root.left, key, set) ||
                helper_of_two_sum(root.right, key, set);
    }

    // Average of Levels in Binary Tree :-->>
    static double[] average_of_level_order(Node root) {
        int n = helper_for_average_of_levels(root);
        double[] arr = new double[n];

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int idx = 0;

        int localSum = 0;
        int localCount = 0;
        while (!q.isEmpty()) {
            Node newNode = q.remove();
            if (newNode == null) {
                arr[idx++] = (double) localSum / localCount;
                localCount = 0;
                localSum = 0;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                localCount++;
                localSum += newNode.data;

                if (newNode.left != null) {
                    q.add(newNode.left);
                }
                if (newNode.right != null) {
                    q.add(newNode.right);
                }
            }
        }

        return arr;
    }

    // helper function for Average of Levels binary tree :-->>
    static int helper_for_average_of_levels(Node root) {
        if (root == null) {
            return 0;
        }

        int left_H = helper_for_average_of_levels(root.left);
        int right_H = helper_for_average_of_levels(root.right);
        return Math.max(left_H, right_H) + 1;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binary_Tree tree = new Binary_Tree();
        Node root = tree.buildTree(nodes);

        // Average of Levels in Binary Tree :-->>
        double[] arr = average_of_level_order(root);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // // Two sum in Binary tree :-->
        // Boolean b = two_sum(root, 15);
        // System.out.print(b);

        // // Height of the tree :-->>
        // int heightOfTree = height_of_the_tree(root);
        // System.out.print("The height of the tree is : " + heightOfTree);

        // // count Node in the binary tree :-->>
        // int Node_count = count_Node(root);
        // System.out.print("Total " + Node_count + " Nodes is present ,");

        // // count Node in the binary tree :-->>
        // int sum_Of_Node = sumOfNodes(root);
        // System.out.print("The sum of the nodes is : " + sum_Of_Node);

        // // Print the node in preOrder sequence :-->>
        // System.out.print("Pre_Order Traversal Result : ");
        // preOrder_traversal(root);
        // System.out.println();

        // // Print the node in postOrder sequence :-->>
        // System.out.print("Post_Order Traversal Result : ");
        // postOrder_traversal(root);
        // System.out.println();

        // // Print the node in postOrder sequence :-->>
        // System.out.print("In_Order Traversal Result : ");
        // inOrder_traversal(root);
        // System.out.println();

        // // Print the level Order Traversal result line by line wise :-->>
        // System.out.println("level_Order Traversal Result : ");
        // level_Order_traversal(root);
        // System.out.println();

        // // Print the level Order Traversal result line by line wise :-->>
        // System.out.print("level_Order Traversal Result : ");
        // levelOrder(root);
        // System.out.println();
    }
}
