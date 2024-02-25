package main.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 접미사_배열 {
    public static void main(String[] args) {
        String[] solution = solution("banana");
        for (String s : solution) {
            System.out.printf("%s ", s);
        }
    }

    public static String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }

        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}
