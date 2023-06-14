package main.study.setion8_DFS_BFS_활용;

import java.util.Scanner;

public class Q7_조합의_경우수 {
    static int answer = 0;
    static int[][] dy = new int[35][35];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(DFS2(n, r));
    }

    // 메모이제이션
    private static int DFS2(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (r == 0 || n == r) return 1;
        else {
            return dy[n][r] = DFS2(n - 1, r - 1) + DFS2(n - 1, r);
        }
    }

    private static void DFS(int n, int r) {
        if (r == 0 || n == r) answer += 1;
        else {
            DFS(n - 1, r - 1);
            DFS(n - 1, r);
        }
    }
}
