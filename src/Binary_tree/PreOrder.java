package Binary_tree;

public class PreOrder {
    public static void main(String[] args) {
        int arr[]={13,15,18,25,30,34,47,60,68,70,72,101};
        int idx=0;
        help(arr,idx);
    }
    public static void help(int arr[],int i){
        if(i>=arr.length || arr[i]==-1){
            return;
        }
        System.out.print(arr[i]+" ");
        help(arr,2*i+1);
        help(arr,2*i+2);
    }
}
