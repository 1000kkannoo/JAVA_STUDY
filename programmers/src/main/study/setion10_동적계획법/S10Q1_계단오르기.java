package main.study.setion10_동적계획법;

import java.util.Scanner;

public class S10Q1_계단오르기 {
    static int n, answer = 0;
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dy = new int[n + 1];
        System.out.println(solution(n));
//        DFS(0);
//        System.out.println(answer);
    }

    private static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n];
    }

    private static void DFS(int sum) {
        if (sum > n) return;
        if (sum == n) answer++;
        else {
            for (int i = 1; i <= 2; i++) {
                DFS(sum + i);
            }
        }
    }
}
