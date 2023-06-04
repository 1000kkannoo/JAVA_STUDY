package main.level0;

public class 배열_만들기_1 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
    }

    private static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for (int i = 0, j = 1; i < answer.length; i++, j++) {
            int sum = k * j;
            answer[i] = sum;
        }
        return answer;
    }
}
