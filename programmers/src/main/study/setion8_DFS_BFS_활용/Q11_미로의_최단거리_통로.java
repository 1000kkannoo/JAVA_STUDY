package main.study.setion8_DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q11_미로의_최단거리_통로 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int[][] dis;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        BFS(1,1);
        System.out.println((dis[7][7] == 0) ? -1 : dis[7][7]);
    }

    private static void BFS(int x, int y) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(x, y));
        board[x][y] = 1;
        while (!queue.isEmpty()) {
            Location poll = queue.poll();
            for (int j = 0; j < 4; j++) {
                int nx = poll.x + dx[j];
                int ny = poll.y + dy[j];
                if (nx <= 7 && nx >= 1 && ny <= 7 && ny >= 1 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Location(nx, ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }
    }
}
