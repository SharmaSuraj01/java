
import java.util.Scanner;

public class Surya {

    static void solve(Scanner sccc) {
        int x = sccc.nextInt();
        int y = sccc.nextInt();

        if (y == x + 1) {
            System.out.println("YES");
            return;
        }

        int minus = (x + 1) - y;
        System.out.println((minus > 0 && minus % 9 == 0) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sccc = new Scanner(System.in);
        int t = sccc.nextInt();

        while (t-- > 0) {
            solve(sccc);
        }
    }
}

