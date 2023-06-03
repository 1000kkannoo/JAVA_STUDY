package main.level0;

public class 숨어있는_숫자의_덧셈_1 {
    public static void main(String[] args) {
        System.out.println(solution("1a2b3c4d123"));
    }

    private static int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            answer = (c < 'A') ? answer + (c - '0') : answer;
        }
        return answer;
    }
}
