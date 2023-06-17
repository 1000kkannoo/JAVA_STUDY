package main.study.setion10_동적계획법;

import java.util.Scanner;

public class S10Q1_계단오르기 {
    static int n, answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        DFS(0);
        System.out.println(answer);
    }

    private static void DFS(int sum) {
        if (sum > n) return;
        if (sum == n) answer++;
        else {
            for (int i = 1; i <= 2; i++) DFS(sum + i);
        }
    }
}
