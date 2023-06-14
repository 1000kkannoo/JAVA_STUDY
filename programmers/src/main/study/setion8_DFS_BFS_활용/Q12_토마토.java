package main.study.setion8_DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q12_토마토 {
    static int m, n;
    static int[][] box, tmp;
    static Queue<Point> queue = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        box = new int[n][m];
        tmp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int input = sc.nextInt();
                if (input == 1) queue.offer(new Point(i, j));
                box[i][j] = input;
            }
        }
        BFS(0, 0);
        boolean flag = true;
        int max = 0;

        for (int[] arr : box) {
            for (int num : arr) {
                if (num == 0) {
                    flag = false;
                    break;
                }
                max = Math.max(max, num);
            }
        }

        if (flag) System.out.println(max);
        else System.out.println(-1);
    }

    private static void BFS(int x, int y) {
        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if (nx >= 0 && nx <= n - 1 && ny >= 0 && ny <= m - 1 && box[nx][ny] == 0) {
                    int val = tmp[poll.x][poll.y] + 1;
                    box[nx][ny] += val;
                    tmp[nx][ny] += val;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }
}
