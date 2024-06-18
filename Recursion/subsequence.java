package Recursion;

public class subsequence {
    public static void main(String[] args) {
        String s="abc";
        String ans="";
        sub(s,ans);
    }

    public static void sub(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char c=s.charAt(0);
        sub(s.substring(1),ans);
        sub(s.substring(1),ans+c);
    }
}
