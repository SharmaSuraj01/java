import java.util.ArrayList;

public class TreeImpleArray {
    int[] tree;
    int size;
    TreeImpleArray(int cap){
        tree=new int[cap];
        size=0;
        for(int i=0;i<cap;i++){
            tree[i]=-1;
        }
    }
    public void addRoot(int data){
        if(size==0){
            tree[0]=data;
            size++;
        }
    }
    public void addAtLeft(int idx,int data){
        int leftIndex=2*idx+1;
        if(tree[leftIndex] == -1){
            tree[leftIndex]=data;
            size++;
        }
    }
    public void addAtright(int idx,int data){
        int rightIndex=2*idx+2;
        if(tree[rightIndex]==-1){
            tree[rightIndex]=data;
            size++;
        }
    }
    public void display(){
        for(int i=0;i<tree.length;i++){
            if(tree[i]!=-1){
                System.out.print(tree[i]+" ");
            }
        }

    }
    public int findParent(int data){
        int idx=-1;
        for(int i=0;i<tree.length;i++){
            if(tree[i]==data){
                idx=i;
            }
        }
        int parent=(idx-1)/2;
        return parent;
    }
    public static void main(String[] args){
        TreeImpleArray bt=new TreeImpleArray(5);
        bt.addRoot(68);
        bt.addAtLeft(0,5);
        bt.addAtright(0,8);
        bt.addAtLeft(1,45);
        bt.addAtright(1,55);
        System.out.println(bt.findParent(45));
        bt.display();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(8);

    }
}
