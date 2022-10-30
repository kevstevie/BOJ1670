import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        dp = new long[10001];

        dp[0] = 1L;
        dp[2] = 1L;
        dp[4] = 2L;

        for (int i = 6; i < 10001; i += 2){
            dp[i] = calculateDp(i);
        }
        dp[0] = 0L;

        System.out.println(dp[N]);
    }

    static long[] dp;

    static long calculateDp(int n) {
        long result = 0L;
        for (int i = 2; i <= n; i += 2) {
            result += dp[i - 2] * dp[n - i];
        }
        return result % 987654321L;
    }
}
