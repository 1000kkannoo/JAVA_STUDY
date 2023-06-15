package main.study.setion8_DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2 {
    int x;
    int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q13_섬나라_아일랜드_BFS {
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
                    BFS(i, j);
                }
            }
        }
    }

    private static void BFS(int x, int y) {
        Queue<Point2> queue = new LinkedList<>();
        queue.offer(new Point2(x, y));
        while (!queue.isEmpty()) {
            Point2 poll = queue.poll();
            board[poll.x][poll.y] = 0;
            for (int k = 0; k < 8; k++) {
                int nx = poll.x + dx[k];
                int ny = poll.y + dy[k];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    queue.offer(new Point2(nx, ny));
                }
            }
        }
    }

}
