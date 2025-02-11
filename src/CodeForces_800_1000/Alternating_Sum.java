package CodeForces_800_1000;

import java.util.Scanner;

public class Alternating_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        while(n-->0){
            int m=sc.nextInt();
            int arr[]=new int[m];
            int sum=0;
            for(int i=0;i<m;i++){
                arr[i]=sc.nextInt();
                if(i%2==0){
                  sum+=arr[i];
                }
                else{
                    sum-=arr[i];
                }
            }
                System.out.println(sum);
        }
            System.out.println();
    }
}
