package main.level0;

public class 카운트_다운 {
    public static void main(String[] args) {
        System.out.println(solution(10,3));
    }

    private static int[] solution(int start, int end) {
        int[] answer = new int[(start - end) + 1];
        for (int i = 0; i < answer.length; i++, start--) {
            answer[i] = start;
        }
        return answer;
    }
}
