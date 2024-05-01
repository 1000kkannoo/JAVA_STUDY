package ch10_dp;

import java.util.Scanner;

public class 계단오르기 {
    static int n, answer = 0;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        DFS(0);

        System.out.println(answer);
    }

    private static void DFS(int num) {
        if (num > n) return;
        if (num == n) answer++;
        else {
            DFS(num + 1);
            DFS(num + 2);
        }
    }
}
