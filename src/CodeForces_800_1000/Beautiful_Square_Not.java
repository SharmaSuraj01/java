package CodeForces_800_1000;
import java.util.Scanner;

public class Beautiful_Square_Not {
    public static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }
    public static boolean isBeautifulMatrix(String s, int n) {
        int size = (int) Math.sqrt(n);

        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != '1' || s.charAt((size - 1) * size + i) != '1') return false;

            if (s.charAt(i * size) != '1' || s.charAt(i * size + (size - 1)) != '1') return false;
        }


        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                if (s.charAt(i * size + j) != '0') return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (!isPerfectSquare(n)) {
                System.out.println("No");
            } else {
                if (isBeautifulMatrix(s, n)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }

        sc.close();
    }
}
