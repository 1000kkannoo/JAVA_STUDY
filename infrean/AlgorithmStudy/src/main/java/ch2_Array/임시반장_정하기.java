package ch2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 임시반장_정하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][5];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, board));
    }

    private static int solution(int n, int[][] board) {
        int result = 1;
        int maxCount = 0;

        // 같은 반이었던 횟수를 기록하기 위한 2차원 배열
        boolean[][] sameClass = new boolean[n][n];

        // 학생들 간의 같은 반이었던 관계 설정
        for (int year = 0; year < 5; year++) { // 학년별로
            for (int i = 0; i < n; i++) { // i 학생
                for (int j = 0; j < n; j++) { // j 학생
                    if (i != j && board[i][year] == board[j][year]) {
                        sameClass[i][j] = true; // i와 j가 같은 반이었다면 true
                    }
                }
            }
        }

        // 각 학생별로 같은 반이었던 다른 학생들의 수 계산
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (sameClass[i][j]) {
                    count++;
                }
            }
            // 가장 많은 학생들과 같은 반이었던 학생 찾기
            if (count > maxCount) {
                maxCount = count;
                result = i + 1; // 학생 번호는 1부터 시작하므로 +1
            }
        }

        return result;
    }
}
