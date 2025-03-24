import java.util.*;

public class final1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int numb = sc.nextInt();
            int numb1 = sc.nextInt();

            int[] a = new int[numb];
            int sum = 0;
            boolean sun = false;

            for (int i = 0; i < numb; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                if (a[i] == numb1) sun = true;
            }

            if (numb == 1 && a[0] == numb1) {
                System.out.println("YES");
            }
            else if (sum == numb1) {
                System.out.println("YES");
            }
            else if (sun) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}