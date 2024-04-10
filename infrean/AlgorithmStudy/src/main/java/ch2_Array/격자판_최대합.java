package ch2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 격자판_최대합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, board));
    }

    private static int solution(int n, int[][] board) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int[] ints : board) {
            for (int j = 0; j < board.length; j++) {
                sum += ints[j];
            }
            max = Math.max(max, sum);
            sum = 0;
        }

        for (int i = 0; i < board.length; i++) {
            for (int[] ints : board) {
                sum += ints[i];
            }
            max = Math.max(max, sum);
            sum = 0;
        }

        for (int i = board.length - 1, j = 0; i >= 0; i--, j++) {
            sum += board[j][i];
        }
        max = Math.max(sum, max);
        sum = 0;

        for (int i = 0; i < board.length; i++) {
            sum += board[i][i];
        }
        max = Math.max(sum, max);

        return max;
    }
}
