package Tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level {
    static Scanner sc = new Scanner(System.in);

    public class BinaryTree {
        class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;

        public BinaryTree() {
            this.root = this.takeinput(null);
        }

        public Node takeinput(Node parent) {
            int cdata = sc.nextInt();
            if (cdata == -1) {
                return null;  // No node here
            }

            Node child = new Node();
            child.data = cdata;
            child.left = this.takeinput(child);
            child.right = this.takeinput(child);

            return child;
        }

        public void levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                int siz = q.size();

                for (int i = 0; i < siz; i++) {
                    Node curr = q.poll();
                    System.out.print(curr.data + " "); // Print nodes on the same line.

                    if (curr.left != null) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null) {
                        q.offer(curr.right);
                    }
                }
                System.out.println(); // New line after each level.
            }
        }
    }

    public static void main(String[] args) {
        Level m = new Level();
        BinaryTree bt = m.new BinaryTree();
        bt.levelorder(bt.root);
    }
}
