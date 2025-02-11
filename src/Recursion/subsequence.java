package Recursion;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        String s="aa";
        String ans="";
        ArrayList<String>l=new ArrayList<>();
        sub(s,ans,l);
        System.out.print(l+" ");
    }

    public static void sub(String s,String ans,ArrayList<String>l){
        if(s.length()==0){
//            System.out.println(ans);
            l.add(ans);
            return;
        }
        char c=s.charAt(0);
        sub(s.substring(1),ans,l);
        sub(s.substring(1),ans+c,l);
    }
}
