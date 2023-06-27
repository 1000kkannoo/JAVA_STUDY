import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q_2667 {
    static int[] arrX = {-1, 0, 1, 0};
    static int[] arrY = {0, 1, 0, -1};

    static int n, countHome;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String arr = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = arr.charAt(j) - '0';
            }
        }

        // 총 단지수
        int count = 0;
        // 단지 내 집의 수 저장
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    map[i][j] = 0;
                    // 총 단지 수 증가
                    count++;
                    // 단지 내부 집의 수 초기화
                    countHome = 1;
                    DFS(i, j);
                    arr.add(countHome);
                }
            }
        }

        Collections.sort(arr);

        for (int num : arr) sb.append(num).append("\n");

        System.out.println(count);
        System.out.println(sb);
    }

    private static void DFS(int x, int y) {
        for (int k = 0; k < 4; k++) {
            int nextX = x + arrX[k];
            int nextY = y + arrY[k];

            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && map[nextX][nextY] == 1) {
                countHome++;
                map[nextX][nextY] = 0;
                DFS(nextX, nextY);
            }
        }
    }
}
