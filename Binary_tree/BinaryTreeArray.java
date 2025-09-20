package Binary_tree;
//
//public class Inorder {
//    public static void main(String[] args) {
//        int arr[]={7,8,10,17,-1,5,6};
//        int idx=0;
//        fun(arr,idx);
//    }
//    public static void fun(int arr[],int i){
//        if(i>=arr.length || arr[i]==-1){
//            return;
//        }
//
//        fun(arr,2*i+1);
//        System.out.println(arr[i]);
//        fun(arr,2*i+2);
//    }
//}


class BinaryTreeArray {
    int[] tree;
    int size;

    public BinaryTreeArray(int capacity) {
        tree = new int[capacity];
        size = 0;
        for (int i = 0; i < capacity; i++) {
            tree[i] = -1;
        }
    }

    public void addRoot(int value) {
        if (size == 0) {
            tree[0] = value;
            size = 1;
        } else {
            System.out.println("Root already exists");
        }
    }
    public void addAtLeft(int parentIndex, int value) {
        int leftIndex = 2 * parentIndex + 1;
        if (leftIndex >= tree.length) {
            System.out.println("Left child index out of bounds");
        } else if (tree[parentIndex] == -1) {
            System.out.println("Parent does not exist");
        } else {
            tree[leftIndex] = value;
            size++;
        }
    }

    public void addAtRight(int parentIndex, int value) {
        int rightIndex = 2 * parentIndex + 2;
        if (rightIndex >= tree.length) {
            System.out.println("Right child index out of bounds");
        } else if (tree[parentIndex] == -1) {
            System.out.println("Parent does not exist");
        } else {
            tree[rightIndex] = value;
            size++;
        }
    }

    public void printTree() {
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] != -1)
                System.out.print(tree[i] + " ");
            else
                System.out.print("_ ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.addRoot(57);
        tree.addAtLeft(0,32);
        tree.addAtLeft(1,3);
        tree.addAtRight(0,43);
        tree.addAtRight(1,32);
        tree.printTree();
    }
}
