package Arrays_Problems;

import java.util.*;

public class Same_Diff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            int m = sc.nextInt();
            int arr[] = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }
            long c=0;
            Map<Integer,Integer>map=new HashMap<>();
            for(int j=0;j<m;j++) {
                int sum = arr[j] - j;
                if (map.containsKey(sum)) {
                    c+=map.get(sum);
                }
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
            System.out.println(c);
        }
    }
}
