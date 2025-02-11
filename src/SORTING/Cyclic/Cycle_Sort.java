package SORTING.Cyclic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cycle_Sort {
    public static void main(String[] args) {
        int[] arr={4,3,1,2};
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=i+1){
                int idx=arr[i]-1;
                int temp=arr[idx];
                arr[idx]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
