package Arrays_Problems;

import java.util.Arrays;

public class Merger_Two_Sorted_Array {
    public static void main(String[] args) {
        int []nums1={1,2,3,0,0,0};
        int []nums2={2,3,4};
        merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int []c=new int[m+n];
        int count=0;
        for(int i=0;i<m;i++){
            c[i]=nums1[i];
            count++;
        }
        for(int i=0;i<n;i++){
            c[count++]=nums2[i];
        }
        Arrays.sort(c);
        for(int i=0;i<(m+n);i++){
            System.out.print(c[i]+" ");
        }
    }
}
