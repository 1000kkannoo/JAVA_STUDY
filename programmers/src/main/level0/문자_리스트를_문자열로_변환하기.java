package main.level0;

import java.util.Arrays;

public class 문자_리스트를_문자열로_변환하기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}));
    }

    private static String solution(String[] arr) {
        return String.join("", arr);
    }
}
