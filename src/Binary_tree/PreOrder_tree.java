package Binary_tree;

import javax.swing.tree.TreeNode;
import java.security.PublicKey;
import java.util.*;


public class PreOrder_tree {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node (int v){
            val=v;
            left=null;
            right=null;
        }
    }
    public static Node createTree(int[] a, int i){
        if(i>=a.length || a[i]==-1){
            return null;
        }
        Node newNode=new Node(a[i]);
        newNode.left=createTree(a,2*i+1);
        newNode.right=createTree(a,2*i+2);
        return newNode;
    }
//    public static int recurse(Node curr , int depth){
//        if(curr==null){
//            return depth;
//        }
//        return Math.max(recurse(curr.left,depth+1),recurse(curr.right,depth+1));
//    }
    public static void print(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        print(node.left);
        print(node.right);
    }
//    public  static int height(Node curr){
//        if(curr==null){
//            return 0;
//        }
//        return 1+Math.max(height(curr.left),height(curr.right));
//    }


    public static void main(String[] args) {
        int []a={7,8,10,17,-1,5,6};
        int i=0;
        Node root=createTree(a,i);
        print(root);
//        System.out.println();
//        System.out.println(recurse(root,0));
//        System.out.println();
//        System.out.println(height(root));

    }
}
