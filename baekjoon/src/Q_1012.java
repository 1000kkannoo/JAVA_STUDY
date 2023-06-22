import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1012 {
    static int[] arrX = {-1, 0, 1, 0};
    static int[] arrY = {0, 1, 0, -1};
    static int[][] arr;
    static int m, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            arr = new int[m][n];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
            }

            int count = 0;
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if (arr[j][l] == 1) {
                        count++;
                        arr[j][l] = 0;
                        DFS(j, l);
                    }
                }
            }

            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static void DFS(int j, int l) {
        arr[j][l] = 0;
        for (int i = 0; i < 4; i++) {
            int x = j + arrX[i];
            int y = l + arrY[i];
            if (x >= 0 && x < m && y >= 0 && y < n && arr[x][y] == 1) DFS(x, y);
        }
    }
}
