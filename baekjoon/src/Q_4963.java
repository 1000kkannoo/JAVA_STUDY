import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_4963 {
    static int[] arrX = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] arrY = {0, 1, 1, 1, 0, -1, -1, -1};
    static int count, w, h;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) break;

            map = new int[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            count = 0;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1) {
                        count++;
                        DFS(i, j);
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nextX = x + arrX[i];
            int nextY = y + arrY[i];

            if (nextX >= 0 && nextX < h && nextY >= 0 && nextY < w && map[nextX][nextY] == 1) {
                map[nextX][nextY] = 0;
                DFS(nextX, nextY);
            }
        }
    }
}
