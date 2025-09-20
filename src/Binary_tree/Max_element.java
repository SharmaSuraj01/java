package Binary_tree;

import java.util.Objects;

public class Max_element {
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
        public static int max(Node curr) {
            if (curr == null) {
                return Integer.MIN_VALUE;
            }
            int l = max(curr.left);
            int r = max(curr.right);

            int ans = Math.max(l, r);
            ans=Math.max(ans,curr.val);
            return ans;

        }
        public static int sum(Node curr){
            if(curr == null){
                return 0;
            }
            int l=sum(curr.left);
            int r=sum(curr.right);
            return curr.val+l+r;
        }

        public static void print(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.val + " ");
            print(node.left);
            print(node.right);
        }


        public static void main(String[] args) {
            int []a={7,8,10,17,-1,5,6};
            int i=0;
           Node root=createTree(a,i);
            print(root);
            System.out.println();
            System.out.println(max(root));
            System.out.println();
            System.out.println(sum(root));
        }

}
