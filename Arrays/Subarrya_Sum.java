package Arrays;

public class Subarrya_Sum {
    public static void main(String[] args) {
        int []arr={0,1,1,0,1,1,1,0,0};
        int cnt0=0,cnt1=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cnt0++;
            }else{
                cnt1++;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==0){
                    cnt0++;
                }else{
                    cnt1++;
                }
                if(cnt0-cnt1==0){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
