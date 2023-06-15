package main.study.setion8_DFS_BFS_활용;

import java.util.Scanner;

public class Q13_섬나라_아일랜드_DFS {
    // 12시 방향으로 주변 탐색
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board;
    static int n, answer = 0;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        solution();

        System.out.println(answer);
    }

    private static void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    DFS(i, j);
                }
            }
        }
    }

    private static void DFS(int index1, int index2) {
        board[index1][index2] = 0;
        for (int k = 0; k < 8; k++) {
            int ni = dx[k] + index1;
            int nj = dy[k] + index2;
            if (ni >= 0 && ni < n & nj >= 0 && nj < n && board[ni][nj] == 1) DFS(ni, nj);
        }
    }
}
