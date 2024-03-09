package main.level0;

import java.util.Arrays;

public class 조건에_맞게_수열_변환하기_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}));
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int[] prevArr = Arrays.copyOf(arr, arr.length);
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(prevArr, arr)) {
                return answer;
            } else {
                answer++;
                prevArr = Arrays.copyOf(arr, arr.length);
            }
        }
    }
}
