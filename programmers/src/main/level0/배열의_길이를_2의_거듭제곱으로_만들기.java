package main.level0;

import java.util.Arrays;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 2, 3, 4, 5, 6});
        for (int anInt : solution) {
            System.out.printf("%d ", anInt);
        }
    }

    public static int[] solution(int[] arr) {
        int i = 0;
        int n;
        while (true) {
            n = (int) Math.pow(2, i++);
            if (n >= arr.length) {
                break;
            }
        }

        return Arrays.copyOf(arr, n);
    }
}
