//import java.util.*;
//
//public class UnevenNodes {
//
//    public static int countUneven(Node root, int k) {
//        if (root == null) return 0;
//        int[] count = new int[1];
//        getHeightAndCount(root, k, count);
//        return count[0];
//    }
//
//
//    private static int getHeightAndCount(Node node, int k, int[] count) {
//        if (node == null) return 0;
//
//        int leftHeight = getHeightAndCount(node.left, k, count);
//        int rightHeight = getHeightAndCount(node.right, k, count);
//        if (Math.abs(leftHeight - rightHeight) >= k) {
//            count[0]++;
//        }
//        return Math.max(leftHeight, rightHeight) + 1;
//    }
//
//    public static Node createTree(int a[], int i) {
//        if (i >= a.length || a[i] == -1) return null;
//        Node newnode = new Node(a[i]);
//        newnode.left = createTree(a, 2 * i + 1);
//        newnode.right = createTree(a, 2 * i + 2);
//        return newnode;
//    }
//
//    public static void main(String args[]) {
//        int num, t;
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        t = sc.nextInt();
//        int a[] = new int[num];
//        for (int i = 0; i < num; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        sc.close();
//        Node root = createTree(a, 0);
//
//        System.out.println(countUneven(root, t));
//    }
//}
//
//class Node {
//    int data;
//    Node left, right;
//    Node(int data) {
//        this.data = data;
//        left = right = null;
//    }
//}