import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q_2178 {
    static int[] arrX = {-1, 0, 1, 0};
    static int[] arrY = {0, 1, 0, -1};
    static int[][] board;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j) - '0';
            }
        }

        System.out.println(BFS(0, 0));
    }

    private static int BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0));
        board[x][y] = 1;
        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = arrX[i] + poll.x;
                int ny = arrY[i] + poll.y;
                if (nx == n - 1 && ny == m - 1) return board[poll.x][poll.y] + 1;
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1) {
                    board[nx][ny] = board[poll.x][poll.y] + 1;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
        return -1;
    }
}
