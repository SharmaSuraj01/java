package CodeForces_800_1000;


import java.util.*;
public class Zahn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        for(int i=0;i<num;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();

            int total=Math.min(b,c);
            System.out.println((a+total-1)/total);
        }
    }
}
