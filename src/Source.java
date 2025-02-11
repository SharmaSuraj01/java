import java.util.*;

public class Source {
    public static String IndianGeek(int N) {
        // List to store matrix values
        List<Integer> matrixValues = new ArrayList<>();

        // Fill the list with the matrix values
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                matrixValues.add(i * j);
            }
        }

        // Sort the list to find the median
        Collections.sort(matrixValues);

        // Calculate median
        int median;
        int size = matrixValues.size();
        if (size % 2 == 1) {
            median = matrixValues.get(size / 2);
        } else {
            median = (matrixValues.get(size / 2 - 1) + matrixValues.get(size / 2)) / 2;
        }

        // Return the median as a string
        return String.valueOf(median);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(IndianGeek(N));
        scanner.close();
    }
}
