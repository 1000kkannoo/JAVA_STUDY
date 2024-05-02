package ch10_dp;

import java.util.Scanner;

public class 돌다리_건너기 {
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n + 1];
        dp[1] = 2;
        dp[2] = 3;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
