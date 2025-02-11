import java.util.*;

public class ShopingSpree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        Arrays.sort(prices);

        // Compute prefix sums
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + prices[i];
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int money = scanner.nextInt();
            int k = scanner.nextInt();

            if (k > n) {
                System.out.println("No");
                continue;
            }

            int total = prefixSum[k];
            System.out.println(total <= money ? "Yes" : "No");
        }
    }
}