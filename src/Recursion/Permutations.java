package Recursion;

public class Permutations {
    public static void main(String[] args) {
        String s="abc";
        String ans="";
        perm(s,ans);
    }
    public static void perm(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            perm(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));
        }
    }
}
