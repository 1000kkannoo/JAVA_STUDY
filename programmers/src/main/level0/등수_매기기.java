package main.level0;

import java.util.Arrays;

public class 등수_매기기 {
    public static void main(String[] args) {
        int[] solution = solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}});
        for (int i : solution) {
            System.out.printf("%d ", i);
        }
    }

    public static int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        double[] avgScores = new double[n];

        for (int i = 0; i < n; i++) {
            avgScores[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (avgScores[i] < avgScores[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}
