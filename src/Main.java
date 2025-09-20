////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//    }
//}

//import java.util.*;
//
//public class Main {
//
//    static final int MOD = 1000000007;
//    static List<List<Integer>> list;
//    static int[] values;
//    static long sum = 0;
//
//    public static Set<Integer> dfs(int node, int parent) {
//        Set<Integer> val = new HashSet<>();
//        val.add(values[node]);
//
//        int min = Integer.MAX_VALUE;
//
//        for (int child : list.get(node)) {
//            if (child != parent) {
//                Set<Integer> childXorValues = dfs(child, node);
//                for (int value1 : val) {
//                    for (int value2 : childXorValues) {
//                        min = Math.min(min, value1 ^ value2);
//                    }
//                }
//
//                val.addAll(childXorValues);
//            }
//        }
//
//        if (val.size() == 1) {
//            min = values[node];
//        }
//
//        sum = (sum + min) % MOD;
//
//        return val;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int two = sc.nextInt();
//        values = new int[n + 1];
//        list = new ArrayList<>();
//        for (int i = 0; i <= n; i++) {
//            list.add(new ArrayList<>());
//        }
//
//        for (int i = 1; i <= n; i++) {
//            values[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < m; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            list.get(u).add(v);
//            list.get(v).add(u);
//        }
//
//        dfs(1, -1);
//
//        System.out.println(sum);
//    }
//}


//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int h = sc.nextInt();
//        int k = sc.nextInt();
//
//        List<List<Integer>> graph = new ArrayList<>();
//        for (int i = 0; i <= n; i++) {
//            graph.add(new ArrayList<>());
//        }
//        for (int i = 0; i < m; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            graph.get(u).add(v);
//            graph.get(v).add(u);
//        }
//
//        int[][] enjoy = new int[n + 1][k + 1];
//        for (int i = 1; i <= h; i++) {
//            for (int j = 1; j <= k; j++) {
//                enjoy[i][j] = sc.nextInt();
//            }
//        }
//
//        int[][] dp = new int[n + 1][k + 1];
//        for (int[] row : dp) {
//            Arrays.fill(row, Integer.MIN_VALUE);
//        }
//
//        for (int i = 1; i <= n; i++) {
//            dp[i][1] = enjoy[i][1];
//        }
//
//        for (int i = 2; i <= k; i++) {
//            int[][] next = new int[n + 1][k + 1];
//            for (int[] row : next) {
//                Arrays.fill(row, Integer.MIN_VALUE);
//            }
//            for (int u = 1; u <= n; u++) {
//                for (int v : graph.get(u)) {
//                    next[v][i] = Math.max(next[v][i], dp[u][i - 1] + enjoy[v][i]);
//                }
//            }
//            dp = next;
//        }
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 1; i <= n; i++) {
//            max = Math.max(max, dp[i][k]);
//        }
//
//        System.out.println(max);
//    }
//}

//3
//        3
//        2
//        3
//        1 2
//        1 3
//        2 3
//        5 1 1
//        1 3 1
//        1 4 10

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int h = sc.nextInt();
        int k = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[][] enjoy = new int[n + 1][k + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                enjoy[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        for (int i = 1; i <= n; i++) {
            dp[i][1] = enjoy[i][1];
        }

        for (int day = 2; day <= k; day++) {
            int[][] dp1 = new int[n + 1][k + 1];
            for (int[] row : dp1) {
                Arrays.fill(row, Integer.MIN_VALUE);
            }
            for (int u = 1; u <= n; u++) {
                for (int v : graph.get(u)) {
                    dp1[v][day] = Math.max(dp1[v][day], dp[u][day - 1] + enjoy[v][day]);
                }
            }
            dp = dp1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dp[i][k]);
        }

        System.out.println(max);
    }
}



