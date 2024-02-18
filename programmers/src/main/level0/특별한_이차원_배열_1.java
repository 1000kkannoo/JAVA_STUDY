package main.level0;

public class 특별한_이차원_배열_1 {
    public static void main(String[] args) {
        int[][] solution = solution(3);
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }

        return answer;
    }
}
