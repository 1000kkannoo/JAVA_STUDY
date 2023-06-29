import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_14716 {
    static int[] arrX = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] arrY = {0, 1, 1, 1, 0, -1, -1, -1};
    static int n, m, count = 0;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    count++;
                    board[i][j] = 0;
                    DFS(i, j);
                }
            }
        }

        System.out.println(count);
    }

    private static void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nextX = x + arrX[i];
            int nextY = y + arrY[i];

            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && board[nextX][nextY] == 1) {
                board[nextX][nextY] = 0;
                DFS(nextX, nextY);
            }
        }
    }
}
