package main.level0;

import java.util.Arrays;

public class 중앙값_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, -1, 0}));
    }

    private static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
