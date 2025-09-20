package CODING_BLOCKS;

import java.util.Scanner;

public class Replace_Them_All {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long sum=0;
        int mul=1;
        if(n==0){
            sum=5;
        }
        while(n>0){
            int rem=(int)(n%10);
            if(rem==0){
                sum=sum+5*mul;
            }else{
                sum=sum+rem*mul;
            }
            mul=mul*10;
            n/=10;
        }
        System.out.println(sum);
    }
}
