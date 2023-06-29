package main.level2;

import java.util.Arrays;

public class 최솟값_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = A.length - 1, j = 0; i >= 0; ) answer += A[i--] * B[j++];

        return answer;
    }
}
