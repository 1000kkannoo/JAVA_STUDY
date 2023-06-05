package main.level0;

import java.util.Arrays;

public class 공백으로_구분하기_2 {
    public static void main(String[] args) {
        System.out.println(solution("    i  love you   "));
    }

    private static String[] solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] split = my_string.split(" ");

        for (String s : split) {
            if (!s.equals("")) {
                answer.append(s).append(" ");
            }
        }

        return answer.toString().split(" ");
    }
}
