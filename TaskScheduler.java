import java.util.*;

public class TaskScheduler {

    public static int canAddTask(int[][] tasks, int n, int K, int[] newTask) {
        // Determine the maximum time we need to consider
        int maxTime = 0;
        for (int[] task : tasks) {
            maxTime = Math.max(maxTime, task[1]);
        }
        maxTime = Math.max(maxTime, newTask[1]);

        // Initialize a difference array to record the changes in the number of active tasks
        int[] diff = new int[maxTime + 2];

        // Process existing tasks
        for (int[] task : tasks) {
            diff[task[0]] += 1;          // Task starts
            diff[task[1] + 1] -= 1;      // Task ends
        }

        // Process the new task
        diff[newTask[0]] += 1;
        diff[newTask[1] + 1] -= 1;

        // Calculate the maximum number of active tasks at any time
        int currentTasks = 0;
        for (int i = 0; i <= maxTime; i++) {
            currentTasks += diff[i];
            if (currentTasks > K) {
                return 0; // Not possible to add the task
            }
        }

        return 1; // Possible to add the task
    }

    public static void main(String[] args) {
        int n = 3;
        int K = 2;
        int[][] tasks = {{1, 3}, {2, 3}, {1, 2}};
        int[] newTask = {3, 3}; // Example task to add

        System.out.println(canAddTask(tasks, n, K, newTask)); // Should return 1 (possible)
    }
}
