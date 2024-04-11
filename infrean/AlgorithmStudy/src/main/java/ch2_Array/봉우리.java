package ch2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 봉우리 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, board));
    }

    private static int solution(int n, int[][] board) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int num = board[i][j];
                int up = board[i + 1][j];
                int down = board[i - 1][j];
                int left = board[i][j - 1];
                int right = board[i][j + 1];

                if (num > Math.max(Math.max(up, down), Math.max(left, right))) {
                    count++;
                }
            }
        }

        return count;
    }
}
