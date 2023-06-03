package main.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 원소들의_곱과_합 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
    }

    private static int solution(int[] num_list) {
        int a = 1;
        int b = 0;
        for (int num : num_list) {
            a *= num;
            b += num;
        }
        return (a < (b * b)) ? 1 : 0;
    }
}
