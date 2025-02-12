import java.util.*;

public class MinimalComprime {

    static int countMinimalCoprimeSegments(int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                if (gcd(i, j) == 1) {
                    boolean isMinimal = true;
                    for (int k = i; k < j; k++) {
                        if (gcd(i, k) == 1 && gcd(k + 1, j) == 1) {
                            isMinimal = false;
                            break;
                        }
                    }
                    if (isMinimal) count++;
                }
            }
        }
        return count;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(countMinimalCoprimeSegments(l, r));
        }
        sc.close();
    }
}
