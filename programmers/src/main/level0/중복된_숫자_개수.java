package main.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 중복된_숫자_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
    }

    private static int solution(int[] array, int n) {
        int count = 0;
        for (int num : array) {
            if (num == n) {
                count++;
            }
        }
        return count;
    }
}
