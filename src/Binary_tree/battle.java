package Binary_tree;

import java.util.Scanner;

import java.util.*;
public class battle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int a=sc.nextInt();
            int arr[]=new int[a];
            int ar=arr[0];
            for(int j=0;j<a;j++){
                arr[i]=sc.nextInt();
            }
            ar+=ar-arr[i];
            System.out.println(ar);
        }
    }
}
