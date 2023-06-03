package main.level1;

import java.util.Arrays;

public class 과일장수 {
    public static void main(String[] args) {
        System.out.println(solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
    }

    public static int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int sum = 0;
        for (int i = score.length; i >= m; i -= m) {
            sum += score[i - m] * m;
        }
        return sum;
    }
}
