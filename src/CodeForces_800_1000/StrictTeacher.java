package CodeForces_800_1000;

import java.util.*;


public class StrictTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt, n, m, q, pos;
        int[] a = new int[5];

        tt = sc.nextInt();
        for (int t = 0; t < tt; t++) {
            n = sc.nextInt();
            m = sc.nextInt();
            q = sc.nextInt();

            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }

            // Ensure a[0] is the smaller value
            if (a[1] < a[0]) {
                int temp = a[0];
                a[0] = a[1];
                a[1] = temp;
            }

            for (int i = 0; i < q; i++) {
                pos = sc.nextInt();
                if (pos < a[0]) {
                    System.out.println(a[0] - 1);
                } else if (pos < a[1]) {
                    System.out.println((a[1] - a[0]) / 2);
                } else {
                    System.out.println(n - a[1]);
                }
            }
        }

        sc.close();
    }
}