package main.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열_정렬하기_1 {
    public static void main(String[] args) {
        int[] solution = solution("hi12392");
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(String my_string) {
        char[] charArray = my_string.toCharArray();
        List<Integer> list = new ArrayList<>();

        for (char c : charArray) {
            if (Character.isDigit(c)) {
                list.add(Integer.parseInt(String.valueOf(c)));
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
