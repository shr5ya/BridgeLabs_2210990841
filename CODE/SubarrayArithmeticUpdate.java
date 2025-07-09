import java.util.*;

public class SubarrayArithmeticUpdate {
    static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = l; j <= r; j++) {
                A[j] = (int)(((long)x + (j - l) * (long)y) % MOD);
            }
        }

        long sum = 0;
        for (int val : A) {
            sum = (sum + val) % MOD;
        }

        System.out.println(sum);
    }
}
