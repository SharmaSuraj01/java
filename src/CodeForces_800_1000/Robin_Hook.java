package CodeForces_800_1000;

import java.util.*;

public class Robin_Hook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for (int i=0;i<num;i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();

//            int o= 0;
            int s= m - n + 1;
            int  e = m;

            int o = (e + 1) / 2 - s / 2;
            if (o % 2 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");

            }
        }
    }
}
