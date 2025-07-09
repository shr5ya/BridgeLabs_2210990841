import java.util.*;

public class ArrayQuerySolver {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();

        int q = sc.nextInt();
        long result = 0;

        for (int t = 0; t < q; t++) {
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (type == 1) {
                for (int i = l; i <= r; i++) {
                    A[i] = (int)(((i - l + 1L) * A[l]) % MOD);
                }
            } else {
                long sum = 0;
                for (int i = l; i <= r; i++) sum = (sum + A[i]) % MOD;
                result = (result + sum) % MOD;
            }
        }

        System.out.println(result);
    }
}
