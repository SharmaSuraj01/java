package CodeForces_800_1000;

import java.util.Scanner;

import java.util.Scanner;

public class AdjacentDigitSums {

    static void solve(Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y == x + 1) {
            System.out.println("YES");
            return;
        }

        int diff = (x + 1) - y;
        System.out.println((diff > 0 && diff % 9 == 0) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            solve(sc); // Pass the same Scanner instance to the method
        }

        sc.close();
    }
}
