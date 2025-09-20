package String;

import java.util.Scanner;

public class change {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < t; i++) {
                String w = sc.nextLine().trim();
                System.out.println(w.substring(0, w.length() - 2) + "i");
            }
        }
    }

