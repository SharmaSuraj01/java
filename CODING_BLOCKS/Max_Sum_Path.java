package CODING_BLOCKS;

import java.util.Scanner;

public class Max_Sum_Path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr1[]=new int[n];
            int arr2[]=new int[m];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                arr2[i]=sc.nextInt();
            }
            System.out.println(PathSum(arr1,arr2,n,m));
        }
    }
    public static int PathSum(int arr1[],int arr2[],int n,int m){
        int sum=0;
        int p=0;
        int q=0;
        int i=0;
        int j=0;

        int ans=0;
        while(i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                int sum1 = 0;
                int sum2 = 0;
                for (int k = p; k <= i; k++) {
                    sum1 += arr1[k];
                }
                for (int k = q; k <= j; k++) {
                    sum2 += arr2[k];
                }
                ans += Math.max(sum1, sum2);
                i++;
                j++;
                p = i;
                q = j;
            }
        }
        if(i==n){
            for (int k = q; k <arr2.length ; k++) {
                ans+=arr2[k];
            }
        }
        if(j==m){
            for (int k = p; k <arr1.length ; k++) {
                ans+=arr1[k];
            }
        }
        return ans;
    }
}
