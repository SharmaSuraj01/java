package CodeForces_800_1000;

import java.util.Scanner;

public class Minimize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0;
        for (int i=0;i<n;i++){
            a=sc.nextInt();
            b= sc.nextInt();
            System.out.println();
        System.out.println(Math.abs(b-a));
        }
    }
}
