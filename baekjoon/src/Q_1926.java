import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1926 {
    static int[] arrX = {-1, 0, 1, 0};
    static int[] arrY = {0, 1, 0, -1};
    static int[][] picture;
    static int n, m, count = 0, answer = Integer.MIN_VALUE, max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        picture = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                picture[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (picture[i][j] == 1) {
                    count++;
                    picture[i][j] = 0;
                    max = 1;
                    DFS(i, j);
                    answer = Math.max(answer, max);
                }
            }
        }

        if (count == 0) answer = 0;

        System.out.println(count + "\n" + answer);
    }

    private static void DFS(int x, int y) {
        for (int k = 0; k < 4; k++) {
            int nextX = x + arrX[k];
            int nextY = y + arrY[k];
            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && picture[nextX][nextY] == 1) {
                max++;
                picture[nextX][nextY] = 0;
                DFS(nextX, nextY);
            }
        }
    }
}
