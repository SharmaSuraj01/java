package CODING_BLOCKS;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a=0;
            int h=0;
            int curr=1;
            while(true){
                a+=curr;
                if(a>n){
                    System.out.println("Harshit");
                    break;
                }
                curr++;
                h+=curr;
                if(h>m){
                    System.out.println("Aayush");
                    break;
                }
                curr++;
            }

        }
    }
}
