package Recursion;

public class subset {
    public static void main(String[] args) {
        int []arr={1,2,4,6,7};
        int t=4;
        int s=0;
        sub(arr,t,s,"");

    }
    public static void sub(int[] arr,int t,int s,String ans){
        if(t==s||s>t){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<arr.length;i++){
            sub(arr,t,s+arr[i],ans+arr[i]);
        }
    }
}
