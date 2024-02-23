package main.level0;

import java.util.Map;

public class 외계행성의_나이 {
    public static void main(String[] args) {
        System.out.println(solution(23));
    }

    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = Map.of("0", "a", "1", "b", "2", "c", "3", "d", "4", "e", "5", "f", "6", "g", "7", "h", "8", "i", "9", "j");
        String[] split = String.valueOf(age).split("");
        for (String s : split) {
            sb.append(map.get(s));
        }
        return sb.toString();
    }
}
