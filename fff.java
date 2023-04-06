import java.util.Scanner;

public class fff {
    public static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long dp[][] = new long[n+1][2];
        dp[1][0] = 1;
        for (int i = 0; i <= n; i++) {
            dp[i][0] += (dp[i-1][0]%MOD + dp[i-1][1] % MOD) % MOD;
            dp[i][1] += (dp[i-1][0]) % MOD;
            if(i > 2){
                dp[i][1] += (dp[i-2][0]) % MOD;
                dp[i][1] += (dp[i-2][1]) % MOD;
            }
        }
        long ans = (dp[n][0] + dp[n][1]) % MOD;
        for (int i = 1; i <= n; i++) {
            ans = ans * i % MOD;
        }
        System.out.println(ans);
    }
}
