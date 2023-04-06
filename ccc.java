import java.util.Scanner;

public class ccc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] dp = new int[1001][1001];
        while (n --> 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            dp[x][y]++;
        }
        int count = 0;
        int max = 0;
        for(int i=1;i<=a+1;i++){
            for(int j=1;j<=b+1;j++){
                count += dp[i][j];
            }
        }
        max = count;
        for(int i=2;i<=1000-a;i++){
            count -= dp[i-1][1];
            count += dp[i+a-1][1];
            max = Math.max(count,max);
        }
        for(int j=2;j<=1000-b;j++){
            count -= dp[1][j-1];
            count += dp[1][j+b-1];
            max = Math.max(count,max);
        }
        for(int i=2;i<=1000-a;i++){
            for(int j=2;j<=1000-b;j++){
                count -=dp[i-1][j-1];
                count -=dp[i-1][j+b-1];
                count -=dp[i+a-1][j-1];
                count += dp[i+a-1][j+b-1];
                max = Math.max(count,max);
            }
        }
        System.out.println(max);
    }
}
