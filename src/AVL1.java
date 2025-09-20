//class Node{
//    int key;
//    Node left, right;
//    int height;
//    Node(int key){
//        this.key = key;
//        this.left = this.right = null;
//        this.height = 1;
//    }
//}
//
//public class AVL1{
//    static Node right_r(Node a){
//        Node b = a.left;
//        Node t2 = b.right;
//        b.right = a;
//        a.left = t2;
//        a.height = 1 + Math.max(height(a.left), height(a.right));
//        b.height = 1 + Math.max(height(b.left), height(b.right));
//        return b;
//    }
//
//    static Node left_r(Node a){
//        Node b = a.right;
//        Node t2 = b.left;
//        b.left = a;
//        a.right = t2;
//        a.height = 1 + Math.max(height(a.left), height(a.right));
//        b.height = 1 + Math.max(height(b.left), height(b.right));
//        return b;
//    }
//
//    static int height(Node N) {
//        if (N == null)
//            return 0;
//        return N.height;
//    }
//
//    static int getBalance(Node node) {
//        if(node == null) return 0;
//        return height(node.left) - height(node.right);
//    }
//
//    public static Node insert(Node node, int key) {
//        if(node == null) {
//            return new Node(key);
//        }
//        if(key < node.key) {
//            node.left = insert(node.left, key);
//        } else if(key > node.key) {
//            node.right = insert(node.right, key);
//        } else {
//            return node;
//        }
//
//        node.height = 1 + Math.max(height(node.left), height(node.right));
//
//        int balance = getBalance(node);
//
//        // Left - Left Case
//        if (balance > 1 && key < node.left.key) {
//            return right_r(node);
//        }
//
//        // Left Right Case
//        if (balance > 1 && key > node.left.key) {
//            node.left = left_r(node.left);
//            return right_r(node);
//        }
//
//        // Right - Right Case
//        if (balance < -1 && key > node.right.key) {
//            return left_r(node);
//        }
//
//        // Right Left Case
//        if (balance < -1 && key < node.right.key) {
//            node.right = right_r(node.right);
//            return left_r(node);
//        }
//
//        return node;
//    }
//
//    static void preOrder(Node node) {
//        if (node != null) {
//            System.out.println(node.key);
//            preOrder(node.left);
//            preOrder(node.right);
//        }
//    }
//
//    public static void main(String[] args) {
//        Node root = null;
//
//        root = insert(root, 10);
//        root = insert(root, 20);
//        root = insert(root, 30);
//        root = insert(root, 40);
//        root = insert(root, 50);
//        root = insert(root, 25);
//
//        System.out.println("Preorder traversal: ");
//        preOrder(root);
//    }
//}