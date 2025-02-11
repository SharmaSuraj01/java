package Recursion;

public class Toss_coun {
    public static void main(String[] args) {
        int n=3;
        String ans=" ";
        toss(n,ans);
    }
    public static void toss(int n,String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        toss(n-1,ans+"H");
        toss(n-1,ans+"T");
    }
}
