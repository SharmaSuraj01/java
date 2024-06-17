package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zero {
    public static void main(String[] args) {
        int arr[]={12,54,0,0,85,24,510,0,5};
        move_zero(arr);
//        System.out.println(Arrays.toString(arr));
    }
    public static void move_zero(int []arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                System.out.print(swap(arr[i],arr[count])+" ");
                count++;
            }
        }
        while (count < n) {
            System.out.print("0 ");
            count++;
        }
//        System.out.println(Arrays.toString(arr));
    }
    public static int swap(int a,int b){
        while(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        return a;
    }
}
