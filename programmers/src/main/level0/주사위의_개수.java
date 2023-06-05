package main.level0;

import java.util.Arrays;

public class 주사위의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 8, 6}, 3));
    }

    private static int solution(int[] box, int n) {
        int boxSum = 1;
        for (int num : box) {
            boxSum *= (num / n);
        }
        return boxSum;
    }
}
