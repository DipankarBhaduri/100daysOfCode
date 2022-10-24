package Day_8;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

public class Root_Equals_sum_of_children {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length)
                break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Node root = buildTree(s);
        boolean result = checkTree(root);
        System.out.print(result);
    }

    public static boolean checkTree(Node root) {
        if (isSumProperty(root) != 0) {
            return true;
        }
        return false;
    }

    static int isSumProperty(Node node) {

        int left_data = 0, right_data = 0;

        if (node == null
                || (node.left == null && node.right == null))
            return 1;
        else {

            if (node.left != null)
                left_data = node.left.data;

            if (node.right != null)
                right_data = node.right.data;

            if ((node.data == left_data + right_data)
                    && (isSumProperty(node.left) != 0)
                    && isSumProperty(node.right) != 0)
                return 1;
            else
                return 0;
        }

    }
}
