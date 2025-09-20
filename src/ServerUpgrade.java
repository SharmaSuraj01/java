import java.util.Arrays;

public class ServerUpgrade {

    public static long getMaximumEfficiency(int[] capacity, int[] numServers) {
        // Sort the capacity array in ascending order
        Arrays.sort(capacity);

        long totalEfficiency = 0;
        int index = capacity.length - 1; // Start from the highest capacity

        // Iterate over the number of servers required in each batch
        for (int serversInBatch : numServers) {
            // The max capacity is at the current index
            int maxCapacity = capacity[index];
            // The min capacity is at the current index - (serversInBatch - 1)
            int minCapacity = capacity[index - serversInBatch + 1];

            // Add the efficiency of the current batch (max - min)
            totalEfficiency += (maxCapacity - minCapacity);

            // Move the index to the next group of servers
            index -= serversInBatch;
        }

        return totalEfficiency;
    }

    public static void main(String[] args) {
        // Example usage
        int[] capacity = {3, 6, 1, 2};
        int[] numServers = {1, 3};

        long result = getMaximumEfficiency(capacity, numServers);
        System.out.println("Maximum Efficiency: " + result);  // Expected output: 5
    }
}
