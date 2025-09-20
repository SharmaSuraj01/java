package Sort;

import java.util.Scanner;

public class Bubble_Sort {
    public static void Bubble(int n,int[] arr){
        for(int turn=1;turn<n;turn++){
            for(int j=0;j<n-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
