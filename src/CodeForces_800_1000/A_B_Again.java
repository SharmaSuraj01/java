package CodeForces_800_1000;

import java.util.Scanner;

public class A_B_Again {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test= sc.nextInt();

        while(test-->0){
            int sum=0;
            int n=sc.nextInt();

            while(n>0){
                int r=n%10;
                sum+=r;
                n/=10;
            }
                System.out.println(sum);
        }
    }
}
