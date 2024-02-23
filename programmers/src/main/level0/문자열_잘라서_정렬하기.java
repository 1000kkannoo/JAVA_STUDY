package main.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열_잘라서_정렬하기 {
    public static void main(String[] args) {
        String[] solution = solution("axbxcxdx");
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public static String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String[] split = myString.split("x");
        for (String s : split) {
            if (!s.equals("")) {
                list.add(s);
            }
        }

        String[] array = list.toArray(new String[0]);
        Arrays.sort(array);
        return array;
    }
}
