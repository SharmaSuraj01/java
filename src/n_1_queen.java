
    import java.util.*;

    public class n_1_queen {
        public static int INF = (int)1e9;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int queen[]=new int[n];
            for(int i=0;i<n;i++) queen[i] = INF;
            System.out.println(raja(queen ,0,n,n-1));
        }
        public static int raja(int []rani , int row, int n, int r){
            if(r == 0){
                return 1;
            }
            if(row == n){
                return 0;
            }
            int c = 0;
            for(int col=0;col < n;col++){

                if(isSafe(rani,row,col)) {
                    rani[row]=col;
                    c += raja(rani, row + 1,n, r-1);
                    rani[row]=INF;
                }

            }
            c += raja(rani, row + 1,n, r);

            return c;
        }
        public static boolean isSafe(int queen[],int row,int col) {
            for (int i = 0; i < row; i++) {
                if (queen[i] == col || queen[i]-i==col-row||queen[i]+i==col+row) {
                    return false;
                }
            }
            return true;

        }
    }


