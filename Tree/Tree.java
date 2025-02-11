package Tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);

    public class BinaryTree {
        class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;

        public BinaryTree() {
            this.root = this.takeinput(null, false);
        }

        public Node takeinput(Node parent, boolean isLeftChild) {
            int cdata = sc.nextInt();
            Node child = new Node();
            child.data = cdata;

            boolean hlc = sc.nextBoolean();
            if (hlc) {
                child.left = this.takeinput(child, true);
            }

            boolean hrc = sc.nextBoolean();
            if (hrc) {
                child.right = this.takeinput(child, false);
            }

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
                    System.out.print(curr.data + " "); // Changed println to print for inline output.

                    if (curr.left != null) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null) {
                        q.offer(curr.right);
                    }
                }
                System.out.println(); // This ensures that after one level of nodes, we print a new line.
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        BinaryTree bt = m.new BinaryTree();
        bt.levelorder(bt.root);
    }
}

