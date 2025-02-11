package String;

import java.util.*;

public class cf_9_2_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(minimumLength(s));
        }
        sc.close();
    }

    private static int minimumLength(String s) {
        int uniqueCount = 0;
        boolean[] seen = new boolean[26];

        for (char c : s.toCharArray()) {
            if (!seen[c - 'a']) {
                seen[c - 'a'] = true;
                uniqueCount++;
            }
        }

        return Math.max(1, uniqueCount);
    }
}

