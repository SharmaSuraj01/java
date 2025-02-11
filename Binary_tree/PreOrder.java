package Binary_tree;

public class PreOrder {
    public static void main(String[] args) {
        int arr[]={7,8,10,17,-1,5,6};
        int idx=0;
        fun(arr,idx);
    }
    public static void fun(int arr[],int i){
        if(i>=arr.length || arr[i]==-1){
            return;
        }
        System.out.println(arr[i]);
        fun(arr,2*i+1);
        fun(arr,2*i+2);
    }
}
