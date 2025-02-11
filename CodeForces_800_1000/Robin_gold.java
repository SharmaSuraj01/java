package CodeForces_800_1000;

import java.util.*;
public class Robin_gold {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int a=sc.nextInt();
            int k=sc.nextInt();

            int arr[]=new int[a];
            for (int j=0;j<a;j++){
                arr[j]=sc.nextInt();
            }

            int gold=0;
            int hp=0;
            for(int j=0;j<arr.length;j++) {
                if (arr[j] >=k){
                    gold+=arr[j];
                }else if(arr[j]==0){
                    if(gold > 0){
                        hp++;
                        gold--;
                    }
                }
            }
            System.out.println(hp);
        }
    }
}
