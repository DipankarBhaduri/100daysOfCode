package Day_72;

import java.util.*;

public class Binary_Search_Tree_Problems {

    // Node class
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

    // Build a Binary Search Tree :-->
    public static Node build_BST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = build_BST(root.left, val);
        } else {
            root.right = build_BST(root.right, val);
        }
        return root;
    }

    // In_order Traversal in Binary search tree :-->>
    public static void inOrder_Traversal(Node root) {
        if (root == null) {
            return;
        }

        inOrder_Traversal(root.left);
        System.out.print(root.data + " ");
        inOrder_Traversal(root.right);
    }

    // Search a key in BST :-->>
    public static boolean search_a_key_in_BST(Node root, int key) {
        if (root == null) {
            return false;
        } else if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return search_a_key_in_BST(root.left, key);
        } else {
            return search_a_key_in_BST(root.right, key);
        }
    }

    // Delete a node from BST :-->>
    public static Node delete_node(Node root, int val) {
        if (root.data > val) {
            root.left = delete_node(root.left, val);
        } else if (root.data < val) {
            root.right = delete_node(root.right, val);
        } else {
            // case - 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case - 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case - 3
            Node LS = left_sucesssor(root.right);
            root.data = LS.data;
            root.right = delete_node(root.right, LS.data);
        }
        return root;
    }

    // Helper function for delete the node :-->>
    static Node left_sucesssor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Print in range is BST :-->>
    public static ArrayList<Integer> print_in_range(Node root, int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        helper_function_for_print_in_range(root, low, high, list);
        return list;
    }

    // Helper function for print in the range :-->>
    static void helper_function_for_print_in_range(Node root, int low, int high, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.data >= low && root.data <= high) {
            list.add(root.data);
        }

        if (root.data > high) {
            helper_function_for_print_in_range(root.left, low, high, list);
        } else if (root.data < low) {
            helper_function_for_print_in_range(root.right, low, high, list);
        } else {
            helper_function_for_print_in_range(root.left, low, high, list);
            helper_function_for_print_in_range(root.right, low, high, list);
        }
    }

    // Target Sum Pair In Bst
    static int[] Target_sum_in_BST(Node root, int val) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 0;
        helper_function_for_target_sum_of_bst(set, root, val, arr);
        return arr;
    }

    // helper function for target sum pair in bst :-->>
    static void helper_function_for_target_sum_of_bst(HashSet<Integer> set, Node root, int val, int[] arr) {
        if (root == null) {
            return;
        }

        if (set.contains(val - root.data)) {
            arr[0] = val - root.data;
            arr[1] = root.data;
            return;
        } else {
            set.add(root.data);
        }

        helper_function_for_target_sum_of_bst(set, root.left, val, arr);
        helper_function_for_target_sum_of_bst(set, root.right, val, arr);
    }

    // Main function :-->>
    public static void main(String[] args) {

        // Build the Binary search tree :-->>
        int[] values = { 5, 3, 2, 4, 1, 7, 6, 8, 9 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = build_BST(root, values[i]);
        }

        // target sum in bst :-->>
        int arr[] = Target_sum_in_BST(root, 17);
        System.out.print(arr[0] + " " + arr[1]);

        // // Print in the range :-->>
        // ArrayList<Integer> list1 = print_in_range(root, 3, 5);
        // Collections.sort(list1);
        // for (int i = 0; i < list1.size(); i++) {
        // System.out.print(list1.get(i) + " ");
        // }

        // // inOrder Traversal :-->>
        // System.out.print("The inOrder Traversal results : ");
        // inOrder_Traversal(root);
        // System.out.println();

        // // Search a key in BST :-->>
        // boolean ans = search_a_key_in_BST(root, 1);
        // if (ans) {
        // System.out.println("The key is present in this binary tree");
        // } else {
        // System.out.println("The key is NOT present in this binary tree");
        // }

        // // delete the node from BST :-->>
        // root = delete_node(root, 3);

        // // inOrder Traversal :-->>
        // System.out.print("The inOrder Traversal results : ");
        // inOrder_Traversal(root);
        // System.out.println();
    }
}
