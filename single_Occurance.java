public class single_Occurance{
public static void main(String[] args) {
    int[] arr = {1, 3, 2, 1, 2, 3, 4, 4, 5, 6, 6};
    int arr1[]={-2,3,4,2,-4,6,-5,5,-6};
    System.out.println(helper(arr));
    System.out.println(unique(arr1));
}
public static int helper(int []arr){
    int unique=0;
    for(int n:arr){
        unique ^=n;
    }
    return unique;
}
public static int unique(int[] arr){
    int uniques=0;
    for(int n:arr){
        uniques+=n;
    }
    return uniques;
}
}