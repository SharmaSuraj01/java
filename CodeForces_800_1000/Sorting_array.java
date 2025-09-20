package CodeForces_800_1000;
import java.util.*;
public class Sorting_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=0;
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                Arrays.sort(arr);
                for(int k=0;k<arr.length;k++){
                    if(arr[k]+arr[arr.length-1]%2!=0){
                        c++;
                    }
                }
            }
        }
    }
}
