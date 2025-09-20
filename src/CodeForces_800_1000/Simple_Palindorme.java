package CodeForces_800_1000;

import java.util.Scanner;

import java.util.Scanner;

public class Simple_Palindorme{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt, n, c;
        char[] alfbt = {'a', 'e', 'i', 'o', 'u'};
        int[] cnt = new int[5];

        tt = sc.nextInt();
        for (int t = 0; t < tt; t++) {
            n = sc.nextInt();
            c = n / 5;

            for (int i = 0; i < 5; i++) {
                cnt[i] = c;
                if (n % 5 > i) cnt[i]++;
            }

            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < cnt[j]; k++) {
                    System.out.print(alfbt[j]);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}