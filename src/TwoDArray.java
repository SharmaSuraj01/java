import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        int arr[][]={{1,3},{5,7},{9,10}};
        int k = 0;
        int[] b = new int[arr.length*arr[0].length];
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
            for(int j=0;j<arr[i].length;j++){
                b[k++] = arr[i][j];
            }
        }
        for(int e:b){
            System.out.print(e+" ");
        }
        int count=0;
        int days=10;
        for(int i=0;i<b.length;i++){
            if(days==b[i]){
            days--;
            }else{
                count++;
                days--;
            }
        }
        System.out.println(count);
    }
    
}
