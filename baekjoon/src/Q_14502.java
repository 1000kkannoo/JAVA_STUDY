import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_14502 {
    static int[] arrX = {-1, 0, 1, 0};
    static int[] arrY = {0, 1, 0, -1};
    static int[][] board, copy;
    static int n, m, result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        copy = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        createWall(0, 0);
        System.out.println(result);
    }

    private static void createWall(int start, int depth) {
        if (depth == 3) {
            copyBoard();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (copy[i][j] == 2) {
                        DFS(i, j);
                    }
                }
            }
            result = Math.max(result, getSafeArea());
            return;
        }

        for (int i = start; i < n * m; i++) {
            int x = i / m;
            int y = i % m;

            if (board[x][y] == 0) {
                board[x][y] = 1;
                createWall(i + 1, depth + 1);
                board[x][y] = 0;
            }
        }
    }

    private static void DFS(int x, int y) {
        for (int k = 0; k < 4; k++) {
            int nextX = x + arrX[k];
            int nextY = y + arrY[k];

            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && copy[nextX][nextY] == 0) {
                copy[nextX][nextY] = 2;
                DFS(nextX, nextY);
            }
        }
    }

    private static void copyBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                copy[i][j] = board[i][j];
            }
        }
    }

    private static int getSafeArea() {
        int safeArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copy[i][j] == 0) {
                    safeArea++;
                }
            }
        }
        return safeArea;
    }
}
