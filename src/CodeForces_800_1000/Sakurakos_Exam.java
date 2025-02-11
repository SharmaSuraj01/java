package CodeForces_800_1000;

import java.util.Scanner;

public class Sakurakos_Exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = a + 2 * b;

            if (sum % 2 == 0 && (a >= (sum / 2) % 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
