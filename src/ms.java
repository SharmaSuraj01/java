import java.util.*;
public class ms {
    public static void main(String[] args) {

        int[] A1 = {3, 4, 6};
        int[] B1 = {6, 5, 4};
        System.out.println(solution(A1, B1));
    }
    public static int solution(int[] A, int[] B) {
        int N = A.length;
        int[][] dp = new int[2][N];

        dp[0][0] = A[0];
        dp[1][0] = B[0];

        for(int i=1;i<N;i++){
            dp[0][i] = Math.max(dp[0][i-1], A[i]);
        }
        for(int i=1;i<N;i++){
            dp[1][i] = Math.max(Math.min(dp[0][i], dp[1][i-1]), B[i]);
        }
        return dp[1][N-1];

    }
}