package CODING_BLOCKS;

import java.util.*;

public class Maximum_Circular_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Maxi(arr));
        }
    }
    public static int Maxi(int []arr){
        int linear_kadane=kadane(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]*=-1;
        }
        int Inverted_array=kadane(arr);
        int circular=Inverted_array+sum;
        return Math.max(circular,linear_kadane);
    }
        public static int kadane(int []arr){
            int sum=Integer.MIN_VALUE;
            int prevSum=0;
            for(int i=0;i<arr.length;i++){
                prevSum+=arr[i];
                sum=Math.max(sum,prevSum);
            if(prevSum<0){
                prevSum=0;
            }
            }
            return sum;
        }
}
