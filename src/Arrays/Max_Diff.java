package Arrays;

public class Max_Diff {
    public static void main(String[] args) {
        int []arr={100,20,30,30,59,33};
        int n=arr.length;
        int fir,diff=0;
        for(int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
               diff= Math.max(arr[j]-arr[i],diff);
            }
        }
        System.out.println(diff);
    }
}