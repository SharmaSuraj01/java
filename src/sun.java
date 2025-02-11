import java.util.Scanner;

public class sun {

    static boolean seven(long n) {
        while (n > 0) {
            if (n % 10 == 7) return true;
            n /= 10;
        }
        return false;
    }

    static boolean helpy(long n, int r) {
        long A = n - r;
        int[] digits = new int[20];
        int len = 0;

        if (A == 0) {
            digits[len++] = 0;
        } else {
            while (A > 0) {
                digits[len++] = (int) (A % 10);
                A /= 10;
            }
        }

        int L = Math.max(len, 12);
        final int maxCarry = 40;
        int[][] dp = new int[32][42];
        int[][] DPP = new int[32][42];
        dp[r][0] = 1;

        for (int pos = 0; pos < L; pos++) {
            for (int i = 0; i <= r; i++)
                for (int j = 0; j < maxCarry; j++)
                    DPP[i][j] = 0;

            int d = (pos < len ? digits[pos] : 0);

            for (int raja = 0; raja <= r; raja++) {
                for (int my = 0; my < maxCarry; my++) {
                    int rani = dp[raja][my];
                    if (rani == 0) continue;
                    for (int plus = 0; plus <= raja; plus++) {
                        int total = d + my + plus;
                        int newDigit = total % 10;
                        int love = total / 10;
                        if (love >= maxCarry) continue;
                        int newRaja = raja - plus;
                        int newrani = rani;
                        if (newDigit == 7) newrani |= 2;
                        DPP[newRaja][love] |= newrani;
                    }
                }
            }
            for (int i = 0; i <= r; i++)
                for (int j = 0; j < maxCarry; j++)
                    dp[i][j] = DPP[i][j];
        }
        return (dp[0][0] & 2) != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            if (seven(n)) {
                System.out.println(0);
                continue;
            }

            int solv = -1;
            for (int r = 1; r <= 30; r++) {
                if (helpy(n, r)) {
                    solv = r;
                    break;
                }
            }
            System.out.println(solv);
        }
    }
}
