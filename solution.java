import java.util.*;

public class solution {
    public static int minPartitions(int[] used, int[] totalCapacity) {
        int n = used.length;
        Arrays.sort(used);
        Arrays.sort(totalCapacity);

        int i = n - 1, j = n - 1, part = 0;
        while (i >= 0) {
            int currentCapacity = totalCapacity[j];
            while (i >= 0 && used[i] <= currentCapacity) {
                currentCapacity -= used[i];
                i--;
            }
            part++;
            j--;
        }

        return part;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] used = new int[n];
        int[] totalCapacity = new int[n];

        for (int i = 0; i < n; i++) used[i] = sc.nextInt();
        for (int i = 0; i < n; i++) totalCapacity[i] = sc.nextInt();

        System.out.println(minPartitions(used, totalCapacity));
    }
}

