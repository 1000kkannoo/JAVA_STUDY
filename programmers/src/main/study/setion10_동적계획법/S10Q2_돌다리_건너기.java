package main.study.setion10_동적계획법;

import java.util.Scanner;

public class S10Q2_돌다리_건너기 {
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n + 1];
        dy[1] = 2;
        dy[2] = 3;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }
        return dy[n];
    }
}
