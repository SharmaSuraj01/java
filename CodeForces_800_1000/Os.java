package CodeForces_800_1000;
import java.util.Scanner;

public class Os {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] positions = new int[n];

            for (int j = 0; j < n; j++) {
                String row = scanner.nextLine();
                for (int k = 0; k < 4; k++) {
                    if (row.charAt(k) == '#') {
                        positions[j] = k + 1;
                        break;
                    }
                }
            }

            for (int j = n - 1; j >= 0; j--) {
                System.out.print(positions[j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
