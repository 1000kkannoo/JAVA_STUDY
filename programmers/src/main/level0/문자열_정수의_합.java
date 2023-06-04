package main.level0;

public class 문자열_정수의_합 {
    public static void main(String[] args) {
        System.out.println(solution("123456789"));
    }

    private static int solution(String num_str) {
        int answer = 0;
        for (char num : num_str.toCharArray()) {
            answer += num - '0';
        }
        return answer;
    }
}
