package main.level0;

public class 문자_반복_출력하기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    private static String solution(String my_string, int n) {
        String[] strArr = my_string.split("");
        StringBuilder answer = new StringBuilder();
        for (String s : strArr) {
            answer.append(s.repeat(n));
        }
        return answer.toString();
    }
}
