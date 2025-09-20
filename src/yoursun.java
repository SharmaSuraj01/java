import java.util.*;

public class yoursun {
    private List<Long> P, Q, R;
    private List<Integer> a;
    private int n;
    private static final int MOD = (int) 1e9 + 7;
    private Map<String, Long> dp = new HashMap<>();

    private long addMod(long a, long b) {
        return (a + b) % MOD;
    }

    private long solve(int pos, long p, long q, long r) {
        if (pos == n) return (p == q && q == r && r == p) ? 1 : 0;

        String state = pos + "," + p + "," + q + "," + r;
        if (dp.containsKey(state))
            return dp.get(state);

        long res = 0;
        long newP = p ^ a.get(pos);
        if (newP == q && newP == r && q == r)
            res = addMod(res, solve(pos + 1, newP, q, r));

        long newQ = q ^ a.get(pos);
        if (p == newQ && newQ == r && p == r)
            res = addMod(res, solve(pos + 1, p, newQ, r));

        long newR = r ^ a.get(pos);
        if (p == q && q == newR && p == newR)
            res = addMod(res, solve(pos + 1, p, q, newR));

        dp.put(state, res);
        return res;
    }

    public long countv(List<Integer> arr) {
        a = arr;
        n = a.size();
        dp.clear();
        return solve(0, 0, 0, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            yoursun solver = new yoursun();
            System.out.println(solver.countv(a));
        }
        sc.close();
    }
}
