package Arrays;

import javax.swing.*;

public class Left_Side {
    public static void main(String[] args) {
        int[] arr = {10,5,9,8,7};
        int pos = 0;
        int t = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < t) {
                int temp=arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;
                pos++;
            }

        }
        int temp=arr[arr.length-1];
        arr[arr.length-1]=arr[pos];
        arr[pos]=temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
