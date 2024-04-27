package ch8_DFS_BFS_심화;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class 미로의_최단거리_통로 {
    static int[] arrY = new int[]{1, 0, -1, 0};
    static int[] arrX = new int[]{0, 1, 0, -1};
    static int[][] board = new int[7][7];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 7; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        board[0][0] = 1;
        System.out.println(BFS(0, 0));
    }

    private static int BFS(int x, int y) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(x, y));
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Location poll = queue.poll();
                for (int j = 0; j < arrX.length; j++) {
                    int nextX = poll.getX() + arrX[j];
                    int nextY = poll.getY() + arrY[j];
                    if (nextX >= 0 && nextX < 7 && nextY >= 0 && nextY < 7 && board[nextY][nextX] == 0) {
                        if (nextX == 6 && nextY == 6) {
                            return level + 1;
                        }
                        board[nextY][nextX] = 1;
                        queue.offer(new Location(nextX, nextY));
                    }
                }
            }
            level++;
        }

        return -1;
    }
}
