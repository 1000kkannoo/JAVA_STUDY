package ch8_DFS_BFS_심화;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 미로_찾기 {
    static int count = 0;
    static int[] moveX = new int[]{-1, 0, 1, 0};
    static int[] moveY = new int[]{0, 1, 0, -1};
    static int[][] board;
    static int[][] visited = new int[7][7];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[7][7];
        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 7; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0][0] = 1;
        DFS(0, 0);

        System.out.println(count);
    }

    private static void DFS(int x, int y) {
        if (x == 6 && y == 6) {
            count++;
            return;
        }

        for (int i = 0; i < moveX.length; i++) {
            int nx = x + moveX[i];
            int ny = y + moveY[i];

            if (nx >= 0 && ny >= 0 && nx < 7 && ny < 7 && visited[nx][ny] == 0 && board[nx][ny] == 0) {
                visited[nx][ny] = 1;
                DFS(nx, ny);
                visited[nx][ny] = 0;
            }
        }
    }
}
