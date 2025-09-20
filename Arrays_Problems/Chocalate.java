package Arrays_Problems;

import java.util.*;

public class Chocalate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] chocolates = new int[N];

            for (int i = 0; i < N; i++) {
                chocolates[i] = sc.nextInt();
            }

            System.out.println(choco(N, M, chocolates));
        }

    }

    public static int choco(int N, int M, int[] chocolates) {
        int max = 0;
        int[] sum = new int[N + 1];
        
        for (int i = 0; i < N; i++) {
            sum[i + 1] = sum[i] + chocolates[i];
        }

        for (int start = 0; start < N; start++) {
            for (int end = start; end < N; end++) {
                int total = sum[end + 1] - sum[start];

                if (total % M == 0) {
                    max = Math.max(max, total / M);
                }
            }
        }

        return max;
    }
}
