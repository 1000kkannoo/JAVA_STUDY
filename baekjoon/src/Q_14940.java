import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point2 {
    int x;
    int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q_14940 {
    static int[] arrX = {-1, 0, 1, 0};
    static int[] arrY = {0, 1, 0, -1};
    static int[][] board, answer;
    static int n, m, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        answer = new int[n][m];
        for (int[] arr : answer) Arrays.fill(arr, -1);

        int startX = 0;
        int startY = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                int input = Integer.parseInt(st.nextToken());
                if (input == 0) answer[i][j] = 0;
                if (input == 2) {
                    startX = i;
                    startY = j;
                }
                board[i][j] = input;
            }
        }

        count = 0;

        board[startX][startY] = 0;
        answer[startX][startY] = 0;

        BFS(startX, startY);

        for (int[] ints : answer) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static void BFS(int startX, int startY) {
        Queue<Point2> queue = new LinkedList<>();
        queue.offer(new Point2(startX, startY));
        while (!queue.isEmpty()) {
            Point2 poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = arrX[i] + poll.x;
                int nextY = arrY[i] + poll.y;

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && answer[nextX][nextY] == -1) {
                    board[nextX][nextY] = board[poll.x][poll.y] + 1;
                    answer[nextX][nextY] = answer[poll.x][poll.y] + 1;
                    queue.offer(new Point2(nextX, nextY));
                }
            }
        }
    }
}
