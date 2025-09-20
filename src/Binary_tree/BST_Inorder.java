package Binary_tree;

public class BST_Inorder {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    private Node root;
    private static Node createTree(int[] arr, int s, int e){
        if(s>e){
            return null;
        }
        int mid=s+(e-s)/2;
        Node node=new Node(arr[mid]);
        node.left=createTree(arr,s,mid-1);
        node.right=createTree(arr,mid+1,e);
        return node;

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
        int arr[]={1,2,3,4,5,6,7,8};
        Node root=createTree(arr,0,arr.length-1);
        print(root);


    }
}
