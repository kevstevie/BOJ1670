import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] dp = new long[10001];

        dp[2] = 1;
        dp[4] = 2;

        for (int i = 6; i < 10001; i += 2){
            dp[i] = ((dp[i - 2] * 2) % 987654321 + addition(dp[i]) % 987654321) % 987654321;
        }
        

    }
}
