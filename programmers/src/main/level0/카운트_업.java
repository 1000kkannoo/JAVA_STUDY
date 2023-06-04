package main.level0;

public class 카운트_업 {
    public static void main(String[] args) {
        System.out.println(solution(3, 10));
    }

    private static int[] solution(int start, int end) {
        int[] answer = new int[(end - start) + 1];
        for (int i = 0; i < answer.length; i++, start++) {
            answer[i] = start;
        }
        return answer;
    }
}
