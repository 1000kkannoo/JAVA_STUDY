import java.util.Scanner;

public class Q_9656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        for (int i = 4; i <= n; i++) dp[i] = Math.min(dp[i - 1], dp[i - 3]) + 1;

        if (dp[n] % 2 == 0) System.out.print("SK");
        else System.out.print("CY");
    }
}
