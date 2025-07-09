import java.util.*;

public class MaxSumOperations {
    static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < N; i++) B[i] = sc.nextInt();

        long sum = 0;

        for (int i = 0; i < N; i++) {
            long op2 = (X > 0 && Y > 0) ? (long)A[i] * (X - 1) * (Y - 1) * Z : Long.MIN_VALUE;
            long op3 = (Y > 0 && Z > 0) ? (long)A[i] * X * (Y - 1) * (Z - 1) : Long.MIN_VALUE;

            if (op2 >= op3 && op2 >= -B[i]) {
                X--; Y--;
                sum = (sum + op2 % MOD) % MOD;
            } else if (op3 >= op2 && op3 >= -B[i]) {
                Y--; Z--;
                sum = (sum + op3 % MOD) % MOD;
            } else {
                sum = (sum - B[i] + MOD) % MOD;
            }
        }

        System.out.println(sum);
    }
}
