package CodeForces_800_1000;
import java.util.Arrays;
import java.util.Scanner;

public class mm {
    static int[] a = new int[100005];

    // Binary search function
    public static int bis(int l, int r, int tar) {
        if (l == r) return l;
        int mid = l + (r - l) / 2;
        if (a[mid] > tar) return bis(l, mid, tar);
        else return bis(mid + 1, r, tar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tt, m, q, pos, idx;

        tt = sc.nextInt();
        for (int t = 0; t < tt; t++) {
            n = sc.nextInt();
            m = sc.nextInt();
            q = sc.nextInt();

            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a, 0, m); // Sort the array for binary search

            for (int i = 0; i < q; i++) {
                pos = sc.nextInt();
                idx = bis(0, m, pos);

                if (idx == 0) {
                    System.out.println(a[0] - 1);
                } else if (idx == m) {
                    System.out.println(n - a[m - 1]);
                } else {
                    System.out.println((a[idx] - a[idx - 1]) / 2);
                }
            }
        }

        sc.close();
    }
}
