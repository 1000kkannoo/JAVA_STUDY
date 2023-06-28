import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_10026 {
    static int n, ch;
    static int[] arrX = {-1, 0, 1, 0};
    static int[] arrY = {0, 1, 0, -1};
    static int[][] picture, picture2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        picture = new int[n][n];
        picture2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            String piece = br.readLine();
            char[] chars = piece.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                int number;
                if (chars[j] == 'R') number = 1;
                else if (chars[j] == 'G') number = 2;
                else number = 3;

                picture[i][j] = number;
                picture2[i][j] = number;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] == 1 || picture[i][j] == 2) {
                    count++;
                    DFS2(i, j);
                } else if (picture[i][j] == 3) {
                    count++;
                    DFS(i, j);
                }
            }
        }

        int count2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (picture2[i][j] != 0) {
                    count2++;
                    ch = picture2[i][j];
                    DFS3(i, j);
                }
            }
        }

        System.out.println(count2 + " " + count);
    }

    private static void DFS3(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nextX = x + arrX[i];
            int nextY = y + arrY[i];

            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && picture2[nextX][nextY] == ch) {
                picture2[nextX][nextY] = 0;
                DFS3(nextX, nextY);
            }
        }
    }

    private static void DFS2(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nextX = x + arrX[i];
            int nextY = y + arrY[i];

            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && (picture[nextX][nextY] == 1 || picture[nextX][nextY] == 2)) {
                picture[nextX][nextY] = 0;
                DFS2(nextX, nextY);
            }
        }
    }

    private static void DFS(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nextX = x + arrX[i];
            int nextY = y + arrY[i];

            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && picture[nextX][nextY] == 3) {
                picture[nextX][nextY] = 0;
                DFS(nextX, nextY);
            }
        }
    }
}
