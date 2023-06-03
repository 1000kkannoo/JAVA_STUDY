package main.level0;

public class 짝수는_싫어요 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    private static int[] solution(int n) {
        int[] answer;
        int plus = 1;

        answer = (n % 2 == 0) ? new int[n / 2] : new int[n / 2 + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = plus;
            plus += 2;
        }
        return answer;
    }
}
