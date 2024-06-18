public class SecMax_Array {
    public static void main(String[] args) {
        int []arr = { 4 , 4 , 1 , 2 , 6 , 7 , 7 };
        int sec_max = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0 ;i < arr.length ; i++){
            if(arr[i] > max){
                sec_max = max;
                max = arr[i];
            } else if (arr[i] != max && arr[i] > sec_max) {
                sec_max = arr[i];
            }
        }
        System.out.println(sec_max);
    }
}
