package Arrays;

public class Leaders_Array {
    public static void main(String[] args) {
        int []arr={7,10,4,3,6,5,2};
        int n=arr.length;
        //Right to left
//        for(int i=0;i<n;i++){
//            boolean flag=false;
//            for (int j=i+1;j<n;j++){
//                if(arr[i]<=arr[j]){
//                    flag=true;
//                }
//            }
//            if(flag==false){
//                System.out.println(arr[i]);
//            }
//        }
        //left to rigth
        int max=arr[n-1];
        System.out.println(max);
        for (int i=n-2;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                System.out.println(max);
            }
        }
    }
}
