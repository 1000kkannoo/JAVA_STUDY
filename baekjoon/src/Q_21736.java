import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_21736 {
    static int[] arrX = {-1, 0, 1, 0};
    static int[] arrY = {0, 1, 0, -1};
    static char[][] map;
    static int n, m, count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[n][m];

        int startX = 0;
        int startY = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
                if (map[i][j] == 'I') {
                    startX = i;
                    startY = j;
                }
            }
        }

        DFS(startX, startY);

        System.out.println((count == 0) ? "TT" : count);
    }

    private static void DFS(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nextX = x + arrX[i];
            int nextY = y + arrY[i];

            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && map[nextX][nextY] != 'X') {
                if (map[nextX][nextY] == 'P') count++;
                map[nextX][nextY] = 'X';
                DFS(nextX, nextY);
            }
        }
    }
}
